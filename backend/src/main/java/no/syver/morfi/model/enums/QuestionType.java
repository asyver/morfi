package no.syver.morfi.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public enum QuestionType {
	INPUT,
	TEXTAREA,
	SELECT;
	
	@JsonValue
    public int toValue() {
        return ordinal();
    }
}