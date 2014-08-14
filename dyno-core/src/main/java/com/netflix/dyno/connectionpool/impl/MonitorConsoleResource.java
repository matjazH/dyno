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
package com.netflix.dyno.connectionpool.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/dyno/console/monitor")
public class MonitorConsoleResource {

	private static final Logger Logger = LoggerFactory.getLogger(MonitorConsoleResource.class);

	public MonitorConsoleResource() {
		Logger.info("LOADED MonitorConsoleResource");
	}

	@Path("/names")
	@GET
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	public String getMonitorNames() {

		return MonitorConsole.getInstance().getMonitorNames();
	}
	
	 @Path("/stats/{monitorName}")
     @GET
	 @Consumes(MediaType.TEXT_PLAIN)
	 @Produces(MediaType.TEXT_PLAIN)
	 public String getMonitorStats(@PathParam("monitorName") String monitorName) {
		 
		 return MonitorConsole.getInstance().getMonitorStats(monitorName);
	 }
	
}
