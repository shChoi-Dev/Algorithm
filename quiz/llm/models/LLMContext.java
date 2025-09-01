package com.mc.llm.models;

import com.mc.llm.models.gemini.chat.GeminiChatModel;

public class LLMContext {

	public BaseModel initChatModel(String url, LLMProviders provider) {
		return switch(provider) {
		case GEMINI -> GeminiChatModel.getInstance(url);
		};
	};
	
}
