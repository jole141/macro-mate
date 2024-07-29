CREATE FUNCTION sync_bmi_insert() RETURNS trigger AS
$$
	DECLARE
		height_in_meters NUMERIC;
	BEGIN
		height_in_meters = (SELECT height/100 FROM app_user WHERE user_id = NEW.user_id) AS NUMERIC;
		UPDATE client_weights
			SET bmi = NEW.weight/(POWER(height_in_meters, 2))
		WHERE user_id = NEW.user_id AND weighing_date_id = NEW.weighing_date_id;
		RETURN NEW;
	END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER ins_sync_bmi
	AFTER INSERT ON client_weights
	FOR EACH ROW
	WHEN (NEW.weight IS NOT NULL AND NEW.weight <> 0)
	EXECUTE PROCEDURE sync_bmi_insert();