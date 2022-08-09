package com.pages;

import com.utils.constants.TimeConstants;

import net.serenitybdd.core.pages.PageObject;

public class AbstractPage extends PageObject {

	public void waitForPageToLoad() {
		int retry = 0;
		do {
			waitABit(TimeConstants.WAIT_TIME_SMALL);
			retry++;
		} while (retry <= TimeConstants.PAGE_LOAD_MAX_RETRY
				&& evaluateJavascript("return document.readyState").equals("complete") != true);
	}
}
