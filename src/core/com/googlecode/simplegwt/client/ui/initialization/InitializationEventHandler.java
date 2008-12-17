/*
 *	Copyright 2008 Isaac Truett.
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 */
package com.googlecode.simplegwt.client.ui.initialization;

import com.google.gwt.event.shared.EventHandler;

/**
 * Handler for {@link InitializationEvent}s.
 * 
 * @since 1.0
 */
public interface InitializationEventHandler extends EventHandler {
	/**
	 * Called when an {@link InitializationEvent} occurs.
	 * 
	 * @param event the event that occurred
	 */
	void onInitialize(final InitializationEvent event);
}
