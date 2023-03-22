package pt.tomasmonteiro.chatgpt;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pt.tomasmonteiro.chatgpt.model.request.OpenaiRequest;

public class Main {

	public static void main(String[] args) {

		OpenaiRequest req = new OpenaiRequest();
		req.setModel("text-davinci-003");
		req.setPrompt("You are an AI\nAI");
		req.setTemperature(0.5f);
		req.setMaxTokens(60);
		req.setTopP(1.0f);
		req.setFrequencyPenalty(0.5f);
		req.setPresencePenalty(0.5f);
		req.setStop(new String[] { "AI:" });

		ObjectMapper mapper = new ObjectMapper();

		String jsonPayload = null;
		try {
			jsonPayload = mapper.writeValueAsString(req);
		} catch (JsonProcessingException e) {
			System.err.println(jsonPayload);
			return;
		}
		System.out.println(jsonPayload);

	}

}
