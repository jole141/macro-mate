package com.zeus.service.impl;

import com.zeus.dto.MealDTO;
import com.zeus.dto.MealIngredientDTO;
import com.zeus.exception.EntityNotFoundException;
import com.zeus.exception.InvalidRoleException;
import com.zeus.model.*;
import com.zeus.repository.*;
import com.zeus.service.MealService;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class MealServiceImpl implements MealService {

    private final static String TRAINER_ROLE = "trainer";

    private final static String USER_NOT_FOUND = "User not found in the database";
    private final static String TRAINER_PLAN_EXCEPTION = "Trainer is not connected to that meal plan";
    private final static String TRAINER_CLIENT_EXCEPTION = "Trainer is not connected to that client";

    private final MealRepository mealRepository;
    private final MealTypeRepository mealTypeRepository;
    private final IngredientRepository ingredientRepository;
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public MealServiceImpl(MealRepository mealRepository, MealTypeRepository mealTypeRepository, IngredientRepository ingredientRepository, UserRepository userRepository, RoleRepository roleRepository) {
        this.mealRepository = mealRepository;
        this.mealTypeRepository = mealTypeRepository;
        this.ingredientRepository = ingredientRepository;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public void saveNewMeal(MealDTO mealDTO, Long clientId, String username) {
        AppUser appUser = userRepository.findByUsername(username);
        if (appUser == null) {
            throw new EntityNotFoundException(USER_NOT_FOUND);
        }
        Role role = roleRepository.findById(appUser.getRoleId());
        if (!role.getName().equals(TRAINER_ROLE)) {
            throw new InvalidRoleException();
        }
        MealPlan mealPlan = mealRepository.isTrainerConnectedToClient(appUser.getId(), clientId);
        if (mealPlan == null) {
            throw new EntityNotFoundException(TRAINER_PLAN_EXCEPTION);
        }
        mealDTO.setMealPlanId(mealPlan.getId());
        MealType mealType = mealTypeRepository.getMealTypeByName(mealDTO.getMealType());
        Long mealId = mealRepository.saveNewMeal(mealDTO, mealType.getId());
        for (MealIngredientDTO mealIngredientDTO : mealDTO.getIngredients()) {
            ingredientRepository.saveMealIngredient(mealIngredientDTO, mealId);
        }
    }

    @Override
    public List<List<MealDTO>> getClientMeals(String username, Date weekDate) {
        AppUser appUser = userRepository.findByUsername(username);
        if (appUser == null) {
            throw new EntityNotFoundException(USER_NOT_FOUND);
        }
        return getMeals(appUser.getId(), weekDate);
    }

    @Override
    public List<MealDTO> getClientMealsDay(String username, Date dayDate) {
        AppUser appUser = userRepository.findByUsername(username);
        if (appUser == null) {
            throw new EntityNotFoundException(USER_NOT_FOUND);
        }
        List<Meal> meals = mealRepository.getClientMealPlan(appUser.getId(), dayDate);
        List<MealDTO> mealDTOS = meals.stream().map(meal -> {
            MealType mealType = mealTypeRepository.getMealTypeById(meal.getMealTypeId());
            MealDTO mealDTO = new MealDTO(meal.getId(), meal.getName(), meal.getMealPlanId(),
                    meal.getDescription(), meal.getPreparationTime(), mealType.getName(), meal.getMealDateTime(), null);
            List<MealIngredientDTO> ingredients = ingredientRepository.getMealIngredients(meal.getId());
            mealDTO.setIngredients(ingredients);
            return mealDTO;
        }).collect(Collectors.toList());
        mealDTOS.sort(Comparator.comparing(MealDTO::getMealDateTime));
        return mealDTOS;
    }

    @Override
    public List<MealType> getAllMealTypes() {
        return mealTypeRepository.getAllMealTypes();
    }

    @Override
    public List<List<MealDTO>> getTrainerClientMeals(String username, Long clientId, Date weekDate) {
        AppUser appUser = userRepository.findByUsername(username);
        if (appUser == null) {
            throw new EntityNotFoundException(USER_NOT_FOUND);
        }
        Role role = roleRepository.findById(appUser.getRoleId());
        if (!role.getName().equals(TRAINER_ROLE)) {
            throw new InvalidRoleException();
        }
        MealPlan mealPlan = mealRepository.isTrainerConnectedToClient(appUser.getId(), clientId);
        if (mealPlan == null) {
            throw new EntityNotFoundException(TRAINER_CLIENT_EXCEPTION);
        }
        return getMeals(clientId, weekDate);
    }

    @Override
    public List<MealDTO> getTrainerClientMealsDay(String username, Long clientId, Date dayDate) {
        AppUser appUser = userRepository.findByUsername(username);
        if (appUser == null) {
            throw new EntityNotFoundException(USER_NOT_FOUND);
        }
        Role role = roleRepository.findById(appUser.getRoleId());
        if (!role.getName().equals(TRAINER_ROLE)) {
            throw new InvalidRoleException();
        }
        MealPlan mealPlan = mealRepository.isTrainerConnectedToClient(appUser.getId(), clientId);
        if (mealPlan == null) {
            throw new EntityNotFoundException(TRAINER_CLIENT_EXCEPTION);
        }
        List<Meal> meals = mealRepository.getClientMealPlan(clientId, dayDate);
        List<MealDTO> mealDTOS = meals.stream().map(meal -> {
            MealType mealType = mealTypeRepository.getMealTypeById(meal.getMealTypeId());
            MealDTO mealDTO = new MealDTO(meal.getId(), meal.getName(), meal.getMealPlanId(),
                    meal.getDescription(), meal.getPreparationTime(), mealType.getName(), meal.getMealDateTime(), null);
            List<MealIngredientDTO> ingredients = ingredientRepository.getMealIngredients(meal.getId());
            mealDTO.setIngredients(ingredients);
            return mealDTO;
        }).collect(Collectors.toList());
        mealDTOS.sort(Comparator.comparing(MealDTO::getMealDateTime));
        return mealDTOS;
    }

    @Override
    public void deleteMeal(String username, Long mealId) {
        AppUser appUser = userRepository.findByUsername(username);
        if (appUser == null) {
            throw new EntityNotFoundException(USER_NOT_FOUND);
        }
        Role role = roleRepository.findById(appUser.getRoleId());
        if (!role.getName().equals(TRAINER_ROLE)) {
            throw new InvalidRoleException();
        }
        mealRepository.deleteMeal(mealId);
    }

    @Override
    public void updateMeal(String username, MealDTO mealDTO) {
        AppUser appUser = userRepository.findByUsername(username);
        if (appUser == null) {
            throw new EntityNotFoundException(USER_NOT_FOUND);
        }
        Role role = roleRepository.findById(appUser.getRoleId());
        if (!role.getName().equals(TRAINER_ROLE)) {
            throw new InvalidRoleException();
        }
        MealType mealType = mealTypeRepository.getMealTypeByName(mealDTO.getMealType());
        mealRepository.updateMeal(mealDTO, mealType);
        mealRepository.deleteMealIngredients(mealDTO.getId());
        for (MealIngredientDTO mealIngredientDTO : mealDTO.getIngredients()) {
            ingredientRepository.saveMealIngredient(mealIngredientDTO, mealDTO.getId());
        }
    }

    private List<List<MealDTO>> getMeals(Long userId, Date weekDate) {
        List<List<MealDTO>> clientMeals = new ArrayList<>();
        for (int i = 0; i <= 6; i++) {
            List<Meal> meals = mealRepository.getClientMealPlan(userId, addNdaysToDate(weekDate, i));
            List<MealDTO> mealDTOS = meals.stream().map(meal -> {
                MealType mealType = mealTypeRepository.getMealTypeById(meal.getMealTypeId());
                MealDTO mealDTO = new MealDTO(meal.getId(), meal.getName(), meal.getMealPlanId(),
                        meal.getDescription(), meal.getPreparationTime(), mealType.getName(), meal.getMealDateTime(), null);
                List<MealIngredientDTO> ingredients = ingredientRepository.getMealIngredients(meal.getId());
                mealDTO.setIngredients(ingredients);
                return mealDTO;
            }).collect(Collectors.toList());
            mealDTOS.sort(Comparator.comparing(MealDTO::getMealDateTime));
            clientMeals.add(mealDTOS);
        }
        return clientMeals;
    }

    private Date addNdaysToDate(Date date, int num) {
        return new Date(date.getTime() + (1000 * 60 * 60 * 24) * num);
    }
}
