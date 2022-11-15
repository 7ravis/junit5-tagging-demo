package com.example.junit5taggingdemo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TstEnvTests {
	
	@Test
	@Tag("tst")
	public void testTstEnv() {
		assertThat("hello world").isNotNull();
	}
	
	@Test
	@Tag("tst")
	@Tag("wip")
	void testTstEnvWip() {
		fail("work in progress");
	}
	
}
