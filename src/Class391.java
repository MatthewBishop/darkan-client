/* Class391 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class391 {
	static NativeSprite[] aClass160Array4778;

	Class391() throws Throwable {
		throw new Error();
	}

	static final void method6733(CS2Executor class527, int i) {
		int i_0_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		ChatLine class108 = Class180.method3032(i_0_, (byte) -1);
		String string = "";
		if (null != class108 && null != class108.clan)
			string = class108.clan;
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static final void method6734(CS2Executor class527, int i) {
		int i_1_ = (class527.intOpValues[301123709 * class527.instrPtr]);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = ((NPC) class527.animable).aClass153_10579.method2609(i_1_, (byte) 106);
	}
}
