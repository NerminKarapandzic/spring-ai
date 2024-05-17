/*
 * Copyright 2023 - 2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.ai.chat.connector;

import org.springframework.ai.chat.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;

public interface ChatConnector {

	/*
	 * default String call(String message) { Prompt prompt = new Prompt(new
	 * UserMessage(message)); Generation generation = call(prompt).getResult(); return
	 * (generation != null) ? generation.getOutput().getContent() : ""; }
	 *
	 * public String call(Message... messages) { Prompt prompt = new
	 * Prompt(Arrays.asList(messages)); Generation generation = call(prompt).getResult();
	 * return (generation != null) ? generation.getOutput().getContent() : ""; }
	 */

	ChatResponse execute(Prompt prompt);

}
