/*******************************************************************************
 * Copyright 2011 Netflix
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.netflix.dyno.connectionpool;

import java.util.Collection;
import java.util.List;

import com.netflix.dyno.connectionpool.impl.lb.HostToken;

/**
 * Interface for supplying the list of {@link HostToken} that represent the dynomite server topology
 * @author poberai
 *
 */
public interface TokenMapSupplier {

	/**
	 * 
	 * @param hosts
	 */
	public void initWithHosts(Collection<Host> hosts);
	
	/**
	 * @return List<HostToken>
	 */
	public List<HostToken> getTokens();
	
	/**
	 * 
	 * @param host
	 * @return
	 */
	public HostToken getTokenForHost(final Host host);
}
