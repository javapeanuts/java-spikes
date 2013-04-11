package com.blogspot.javapeanuts.spikes.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class RuleSampleTest {
	@Rule
	public Bucket bucket = new Bucket();
	
	@Test
	public void addStringsToBucket() throws Exception {
		assertEquals(1, bucket.getStringsCount());
		bucket.put("aa");
		bucket.put("bb");
		assertEquals(3, bucket.getStringsCount());
	}
	
	@Test
	public void alearBucket() throws Exception {
		assertEquals(1, bucket.getStringsCount());
		bucket.clear();
		assertEquals(0, bucket.getStringsCount());
	}
	
	private static final class Bucket implements TestRule {
		private final List<String> strings = new ArrayList<String>();
		@Override
		public Statement apply(Statement base, Description description) {
			return new BucketStatement(base, this);
		}
		
		public void put(String s) {
			strings.add(s);
		}
		
		public int getStringsCount() {
			return strings.size();
		}
		
		public void clear() {
			strings.clear();
		}
	}
	
	private static final class BucketStatement extends Statement {
		private final Statement base;
		private final Bucket bucket;
		
		public BucketStatement(Statement base, Bucket bucket) {
			this.base = base;
			this.bucket = bucket;
		}

		@Override
		public void evaluate() throws Throwable {
			bucket.put("INITIAL PUT");
			base.evaluate();
		}
	}
}
