/**
 * Copyright 2008 - 2015 The Loon Game Engine Authors
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 * 
 * @project loon
 * @author cping
 * @email：javachenpeng@yahoo.com
 * @version 0.5
 */
package loon;

public interface Accelerometer {
	
	/**
	 * 重力感应方向
	 */
	public static enum SensorDirection {
		EMPTY, LEFT, RIGHT, UP, DOWN;
	}

	public interface Event {

		public void onDirection(SensorDirection direction, float x, float y,
				float z);

		public void onShakeChanged(float force);
	}

	public void start() ;

	public void stop() ;

	public float getLastX() ;

	public float getLastY() ;

	public float getLastZ();

	public float getX();

	public float getY() ;

	public float getZ() ;

	public AccelerometerState getState() ;

	public int getSleep();

	public void sleep(int sleep);

	public int getAllDirection();

	public Event getEvent() ;

	public void setEvent(Event event) ;

	public float getOrientation();

	public SensorDirection getDirection();
}
