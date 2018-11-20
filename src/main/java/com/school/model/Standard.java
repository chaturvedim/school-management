package com.school.model;

public enum Standard {
	SIXTH(6), SEVENTH(7), EIGHTH(8), NINETH(9);

	private final int standard;

	private Standard(int standard) {
		this.standard = standard;
	}

	public int getStandard() {
		return standard;
	}

	public static Standard from(int value) {
		for (Standard std : values()) {
			if (std.getStandard() == value) {
				return std;
			}
		}
		throw new IllegalArgumentException("Not a valid standard");
	}
}
