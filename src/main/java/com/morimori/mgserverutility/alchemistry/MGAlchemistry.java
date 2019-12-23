package com.morimori.mgserverutility.alchemistry;

import java.awt.Color;

import al132.alchemistry.chemistry.ElementRegistry;

public class MGAlchemistry {
	public static void preInit() {
		ElementRegistry.INSTANCE.add(125, "naquadah", "Nq", new Color(1, 5, 1));
		ElementRegistry.INSTANCE.add(810, "yaju", "Yj", new Color(146, 83, 7));

	}

	public static void Init() {

	}

	public static void posInit() {

	}

}
