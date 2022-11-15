package com.example.junit5taggingdemo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class StgEnvTests {
	
	@Test
	@Tag("stg")
	public void testStgEnv() {
		assertThat("hello world").isNotNull();
	}
	
}
