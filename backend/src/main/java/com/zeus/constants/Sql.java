package com.zeus.constants;

public class Sql {

    public static final String GET_ROLE_BY_NAME = "SELECT * FROM role WHERE role_name = ? LIMIT 1";
    public static final String GET_ROLE_BY_ID = "SELECT * FROM role WHERE role_id = ? LIMIT 1";

    public static final String GET_USER_BY_USERNAME = "SELECT * FROM app_user WHERE username = ?";
    public static final String GET_USER_BY_EMAIL = "SELECT * FROM app_user WHERE email = ?";
    public static final String GET_USER_BY_ID = "SELECT * FROM app_user WHERE user_id = ?";
    public static final String GET_CLIENTS_TRAINER = "SELECT personal_trainer_id FROM app_user JOIN meal_plan ON user_id = client_id WHERE client_id = ?";
    public static final String GET_ALL_TRAINERS = "SELECT * FROM app_user NATURAL JOIN role WHERE role_name = 'trainer'";
    public static final String GET_TRAINERS_CLIENTS = "SELECT * FROM app_user WHERE user_id IN (SELECT client_id FROM meal_plan WHERE personal_trainer_id = ?)";
    public static final String SAVE_USER = "INSERT INTO app_user(first_name, last_name, username, password, email, height, description, role_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?) RETURNING user_id";
    public static final String SAVE_WEIGHING_DATE = "INSERT INTO weighing_date(date) VALUES (?) RETURNING weighing_date_id";
    public static final String GET_WEIGHING_DATE = "SELECT weighing_date_id FROM weighing_date WHERE date = ?";
    public static final String SAVE_USER_WEIGHT = "INSERT INTO client_weights(weight, user_id, weighing_date_id) VALUES (?, ?, ?)";
    public static final String DELETE_USER_WEIGHT = "DELETE FROM client_weights WHERE user_id = ? AND weighing_date_id = ?";
    public static final String GET_USER_WEIGHT_BMI = "SELECT * FROM client_weights NATURAL JOIN weighing_date WHERE user_id = ? AND date = (SELECT MAX(date) FROM weighing_date NATURAL JOIN client_weights WHERE user_id = ? GROUP BY user_id )";
    public static final String UPDATE_CLIENT_HEIGHT = "UPDATE app_user SET height = ? WHERE username = ?";
    public static final String UPDATE_TRAINER_INFO = "UPDATE app_user SET description = ? WHERE username = ?";
    public static final String SEND_REQUEST = "INSERT INTO request VALUES(?, ?)";
    public static final String ACCEPT_REQUEST = "INSERT INTO meal_plan(client_id, personal_trainer_id)  VALUES(?, ?)";

    public static final String GET_REQUEST_BY_IDS = "SELECT * FROM request WHERE client_id = ? AND personal_trainer_id = ?";
    public static final String DELETE_REQUEST = "DELETE FROM request WHERE client_id = ? AND personal_trainer_id = ?";
    public static final String GET_TRAINERS_REQUESTS = "SELECT * FROM app_user WHERE user_id IN (SELECT client_id FROM request WHERE personal_trainer_id = ?)";

    public static final String DELETE_USERS_TRAINER = "DELETE FROM meal_plan WHERE client_id = ? AND personal_trainer_id = ?";

    public static final String GET_ALL_MEAL_TYPE = "SELECT * FROM meal_type";
    public static final String GET_MEAL_TYPE_BY_NAME = "SELECT * FROM meal_type WHERE meal_type_name = ?";
    public static final String GET_MEAL_TYPE_BY_ID = "SELECT * FROM meal_type WHERE meal_type_id = ?";
    public static final String SEARCH_INGREDIENT = "SELECT * FROM ingredient WHERE LOWER(ingredient_name) LIKE LOWER(?) LIMIT 20";
    public static final String GET_MEAL_INGREDIENTS = "SELECT ingredient_id, ingredient_quantity, ingredient_name FROM ingredient NATURAL JOIN meal_ingredients WHERE meal_id = ?";
    public static final String GET_CLIENTS_MEALS = "SELECT meal.* FROM meal NATURAL JOIN meal_plan WHERE client_id = ? AND DATE(meal_date_time) = ?";
    public static final String SAVE_NEW_MEAL = "INSERT INTO meal(meal_date_time, meal_name, meal_plan_id, description, preparation_time, meal_type_id) VALUES (?, ?, ?, ?, ?, ?) RETURNING meal_id";
    public static final String SAVE_MEAL_INGREDIENTS = "INSERT INTO meal_ingredients VALUES (?, ?, ?)";
    public static final String IS_TRAINER_CONNECTED_TO_PLAN = "SELECT * FROM meal_plan WHERE personal_trainer_id = ? AND meal_plan_id = ?";
    public static final String IS_TRAINER_CONNECTED_TO_CLIENT = "SELECT * FROM meal_plan WHERE personal_trainer_id = ? AND client_id = ?";
    public static final String DELETE_MEAL = "DELETE FROM meal WHERE meal_id = ?";
    public static final String DELETE_MEAL_INGREDIENTS = "DELETE FROM meal_ingredients WHERE meal_id = ?";
    public static final String UPDATE_MEAL = "UPDATE meal SET meal_name = ?, description = ?, preparation_time = ?, meal_date_time = ?, meal_type_id = ? WHERE meal_id = ?";

    public static final String GET_PERSONAL_TRAINER_RATING = "SELECT ROUND(AVG(rating),1) AS rating FROM review WHERE personal_trainer_id = ? GROUP BY personal_trainer_id";
    public static final String IS_PERSONAL_TRAINER_RATED_BY_CLIENT = "SELECT rating FROM review WHERE client_id = ? AND personal_trainer_id = ?";
    public static final String RATE_PERSONAL_TRAINER = "INSERT INTO review(rating, client_id, personal_trainer_id) VALUES (?, ?, ?)";
}
