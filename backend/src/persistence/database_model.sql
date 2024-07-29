DROP TABLE meal_ingredients;
DROP TABLE review;
DROP TABLE meal;
DROP TABLE meal_plan;
DROP TABLE request;
DROP TABLE client_weights;
DROP TABLE app_user;
DROP TABLE weighing_date;
DROP TABLE meal_type;
DROP TABLE role;
DROP TABLE ingredient;

CREATE TABLE ingredient
(
  ingredient_id BIGSERIAL,
  ingredient_name VARCHAR(64) NOT NULL,
  PRIMARY KEY (ingredient_id)
);

CREATE TABLE role
(
  role_id BIGSERIAL,
  role_name VARCHAR(32) UNIQUE NOT NULL,
  PRIMARY KEY (role_id)
);

CREATE TABLE meal_type
(
  meal_type_id BIGSERIAL,
  meal_type_name VARCHAR(64) NOT NULL,
  PRIMARY KEY (meal_type_id)
);

CREATE TABLE weighing_date
(
  weighing_date_id BIGSERIAL,
  date DATE UNIQUE NOT NULL,
  PRIMARY KEY (weighing_date_id)
);

CREATE TABLE app_user
(
  user_id BIGSERIAL,
  first_name VARCHAR(32) NOT NULL,
  last_name VARCHAR(32) NOT NULL,
  username VARCHAR(20) UNIQUE NOT NULL,
  password VARCHAR(64) NOT NULL,
  email VARCHAR(32) UNIQUE NOT NULL,
  height NUMERIC,
  description VARCHAR(1023),
  role_id BIGSERIAL NOT NULL,
  PRIMARY KEY (user_id),
  FOREIGN KEY (role_id) REFERENCES role(role_id)
);

CREATE TABLE request
(
  client_id BIGSERIAL NOT NULL,
  personal_trainer_id BIGSERIAL NOT NULL,
  FOREIGN KEY (client_id) REFERENCES app_user(user_id),
  FOREIGN KEY (personal_trainer_id) REFERENCES app_user(user_id)
);

CREATE TABLE client_weights
(
  weight NUMERIC NOT NULL,
  bmi NUMERIC,
  user_id BIGSERIAL NOT NULL,
  weighing_date_id BIGSERIAL NOT NULL,
  FOREIGN KEY (user_id) REFERENCES app_user(user_id),
  FOREIGN KEY (weighing_date_id) REFERENCES weighing_date(weighing_date_id)
);

CREATE TABLE meal_plan
(
  meal_plan_id BIGSERIAL,
  personal_trainer_id BIGSERIAL NOT NULL,
  client_id UNIQUE BIGSERIAL NOT NULL,
  PRIMARY KEY (meal_plan_id),
  FOREIGN KEY (personal_trainer_id) REFERENCES app_user(user_id),
  FOREIGN KEY (client_id) REFERENCES app_user(user_id)
);

CREATE TABLE meal
(
  meal_id BIGSERIAL,
  meal_name VARCHAR(32) NOT NULL,
  meal_plan_id BIGSERIAL NOT NULL,
  preparation_time VARCHAR(10) NOT NULL,
  meal_date_time TIMESTAMP NOT NULL,
  description VARCHAR(1023) NOT NULL,
  meal_type_id BIGSERIAL NOT NULL,
  PRIMARY KEY (meal_id),
  FOREIGN KEY (meal_plan_id) REFERENCES meal_plan(meal_plan_id) ON DELETE CASCADE,
  FOREIGN KEY (meal_type_id) REFERENCES meal_type(meal_type_id)
);

CREATE TABLE review
(
  review_id BIGSERIAL,
  rating INT NOT NULL CHECK (rating BETWEEN 0 AND 5),
  personal_trainer_id BIGSERIAL NOT NULL,
  client_id BIGSERIAL NOT NULL,
  PRIMARY KEY (review_id),
  FOREIGN KEY (personal_trainer_id) REFERENCES app_user(user_id),
  FOREIGN KEY (client_id) REFERENCES app_user(user_id)
);

CREATE TABLE meal_ingredients
(
  ingredient_quantity VARCHAR(10) NOT NULL,
  meal_id BIGSERIAL NOT NULL,
  ingredient_id BIGSERIAL NOT NULL,
  PRIMARY KEY (meal_id, ingredient_id),
  FOREIGN KEY (meal_id) REFERENCES meal(meal_id) ON DELETE CASCADE,
  FOREIGN KEY (ingredient_id) REFERENCES ingredient(ingredient_id)
);