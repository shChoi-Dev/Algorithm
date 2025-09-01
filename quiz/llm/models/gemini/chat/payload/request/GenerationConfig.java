package com.mc.llm.models.gemini.chat.payload.request;

public record GenerationConfig<T>(
		String responseMimeType,
		ResponseSchema<T> responseSchema
		) {
	
	public GenerationConfig(ResponseSchema<T> responseSchema) {
		this("application/json",responseSchema);
	}
}
