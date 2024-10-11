package xyz.cuddlecloud.javax.colorlib;

import java.awt.Color;
import java.util.Random;
import java.util.function.Supplier;

public final class RandomColor {

	private static final Random rd = new Random();

	public static Supplier<Color> random = () -> new Color(rd.nextInt(256), rd.nextInt(256), rd.nextInt(256));

}
