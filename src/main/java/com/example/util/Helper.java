/*
 * Copyright 2022, 2022 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.example.util;

import java.io.PrintStream;
import java.io.PrintWriter;

public class Helper {
	public static final String MESSAGE_PREFIX = "libertydiag: ";

	public static void printThrowableToStream(PrintStream out, Throwable t) {
		while (t != null) {
			out.println("Error (" + t.getClass().getName() + "): " + t.getLocalizedMessage() + "<br />");
			StackTraceElement[] stackElements = t.getStackTrace();
			for (StackTraceElement stackElement : stackElements) {
				out.println("&nbsp;&nbsp;&nbsp;&nbsp;" + stackElement.toString() + "<br />");
			}
			t = t.getCause();
		}
	}
	
	public static void printThrowableToStream(PrintWriter out, Throwable t) {
		while (t != null) {
			out.println("Error (" + t.getClass().getName() + "): " + t.getLocalizedMessage() + "<br />");
			StackTraceElement[] stackElements = t.getStackTrace();
			for (StackTraceElement stackElement : stackElements) {
				out.println("&nbsp;&nbsp;&nbsp;&nbsp;" + stackElement.toString() + "<br />");
			}
			t = t.getCause();
		}
	}

	public static void sysout(Object message) {
		System.out.println(MESSAGE_PREFIX + message);
	}
}
