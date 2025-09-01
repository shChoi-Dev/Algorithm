package com.mc.trpg.infra.llm;

import java.util.HashMap;
import java.util.Map;

import com.mc.llm.models.BaseModel;
import com.mc.llm.models.LLMContext;
import com.mc.llm.models.LLMProviders;

public class ModelProvider {
	
	public static ModelProvider INSTANCE;
	private Map<LLMProviders, BaseModel> modelMap;
	private final String GEMINI_API_URL = "https://generativelanguage.googleapis.com/v1beta/models/gemini-2.5-flash:generateContent";
	
	public static ModelProvider getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new ModelProvider();
		}
		
		return INSTANCE;
	}
	
	public ModelProvider() {
		LLMContext context = new LLMContext();
		modelMap = new HashMap<>();
		modelMap.put(LLMProviders.GEMINI, context.initChatModel(GEMINI_API_URL, LLMProviders.GEMINI));
	}
	
	public BaseModel create(LLMProviders provider) {
		return modelMap.get(provider);
	}

}
