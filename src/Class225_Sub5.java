/* Class225_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class225_Sub5 extends RouteStrategy {
	int anInt7971;
	SceneObjectType aClass458_7972;

	public boolean method3789(int i, int i_0_, int i_1_, ClipMap class336) {
		return class336.method5986(i_0_, i_1_, i, -1440558477 * approxDestinationX, 1732585867 * approxDestinationY, ((Class225_Sub5) this).aClass458_7972.method243((byte) 1), (((Class225_Sub5) this).anInt7971 * 1056438757), (short) -12218);
	}

	public boolean canExit(int i, int i_2_, int i_3_, ClipMap class336, byte i_4_) {
		return class336.method5986(i_2_, i_3_, i, -1440558477 * approxDestinationX, 1732585867 * approxDestinationY, ((Class225_Sub5) this).aClass458_7972.method243((byte) 1), (((Class225_Sub5) this).anInt7971 * 1056438757), (short) -26880);
	}

	public boolean method3786(int i, int i_5_, int i_6_, ClipMap class336) {
		return class336.method5986(i_5_, i_6_, i, -1440558477 * approxDestinationX, 1732585867 * approxDestinationY, ((Class225_Sub5) this).aClass458_7972.method243((byte) 1), (((Class225_Sub5) this).anInt7971 * 1056438757), (short) -30854);
	}

	public boolean method3788(int i, int i_7_, int i_8_, ClipMap class336) {
		return class336.method5986(i_7_, i_8_, i, -1440558477 * approxDestinationX, 1732585867 * approxDestinationY, ((Class225_Sub5) this).aClass458_7972.method243((byte) 1), (((Class225_Sub5) this).anInt7971 * 1056438757), (short) -23786);
	}

	Class225_Sub5() {
		/* empty */
	}

	public boolean method3785(int i, int i_9_, int i_10_, ClipMap class336) {
		return class336.method5986(i_9_, i_10_, i, -1440558477 * approxDestinationX, 1732585867 * approxDestinationY, ((Class225_Sub5) this).aClass458_7972.method243((byte) 1), (((Class225_Sub5) this).anInt7971 * 1056438757), (short) -29453);
	}

	static void method13042(GraphicalRenderer class505, int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_) {
		SceneObjectManager class206 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1053106228);
		SceneObject interface12 = (SceneObject) class206.getWall(i, i_11_, i_12_, (byte) -80);
		if (null != interface12) {
			ObjectDefinitions class478 = IndexLoaders.MAP_REGION_DECODER.method4436(-1708238959).getObjectDefinitions(interface12.getId(1992951281), 65280);
			int i_18_ = interface12.method92(-401484615) & 0x3;
			int i_19_ = interface12.method89(2041579125);
			if (-272332433 * class478.anInt5689 != -1)
				Class415.method6997(class505, class478, i_18_, i_13_, i_14_, -1222879504);
			else {
				int i_20_ = i_15_;
				if (-348507379 * class478.anInt5652 > 0)
					i_20_ = i_16_;
				if (i_19_ == 1109376893 * SceneObjectType.WALL_STRAIGHT.type || (1109376893 * SceneObjectType.WALL_WHOLE_CORNER.type == i_19_)) {
					if (0 == i_18_)
						class505.method8428(i_13_, i_14_, 4, i_20_, -1796764807);
					else if (i_18_ == 1)
						class505.method8659(i_13_, i_14_, 4, i_20_, 2123988868);
					else if (2 == i_18_)
						class505.method8428(3 + i_13_, i_14_, 4, i_20_, -1796764807);
					else if (3 == i_18_)
						class505.method8659(i_13_, i_14_ + 3, 4, i_20_, -1272168357);
				}
				if (i_19_ == SceneObjectType.WALL_STRAIGHT_CORNER.type * 1109376893) {
					if (i_18_ == 0)
						class505.method8425(i_13_, i_14_, 1, 1, i_20_, (byte) -113);
					else if (i_18_ == 1)
						class505.method8425(i_13_ + 3, i_14_, 1, 1, i_20_, (byte) -40);
					else if (i_18_ == 2)
						class505.method8425(i_13_ + 3, 3 + i_14_, 1, 1, i_20_, (byte) -91);
					else if (i_18_ == 3)
						class505.method8425(i_13_, 3 + i_14_, 1, 1, i_20_, (byte) -29);
				}
				if (i_19_ == 1109376893 * SceneObjectType.WALL_WHOLE_CORNER.type) {
					if (i_18_ == 0)
						class505.method8659(i_13_, i_14_, 4, i_20_, 1526236522);
					else if (i_18_ == 1)
						class505.method8428(i_13_ + 3, i_14_, 4, i_20_, -1796764807);
					else if (i_18_ == 2)
						class505.method8659(i_13_, i_14_ + 3, 4, i_20_, 1687799163);
					else if (3 == i_18_)
						class505.method8428(i_13_, i_14_, 4, i_20_, -1796764807);
				}
			}
		}
		interface12 = (SceneObject) class206.getInteractableObject(i, i_11_, i_12_, client.anInterface25_7446, -233664382);
		if (interface12 != null) {
			ObjectDefinitions class478 = IndexLoaders.MAP_REGION_DECODER.method4436(-1933772768).getObjectDefinitions(interface12.getId(281132177), 65280);
			int i_21_ = interface12.method92(-763690677) & 0x3;
			int i_22_ = interface12.method89(1162036783);
			if (-272332433 * class478.anInt5689 != -1)
				Class415.method6997(class505, class478, i_21_, i_13_, i_14_, 1089913418);
			else if (i_22_ == SceneObjectType.WALL_INTERACT.type * 1109376893) {
				int i_23_ = -1118482;
				if (class478.anInt5652 * -348507379 > 0)
					i_23_ = -1179648;
				if (i_21_ == 0 || i_21_ == 2)
					class505.method8429(i_13_, 3 + i_14_, 3 + i_13_, i_14_, i_23_, (byte) 75);
				else
					class505.method8429(i_13_, i_14_, i_13_ + 3, 3 + i_14_, i_23_, (byte) -70);
			}
		}
		interface12 = (SceneObject) class206.getGroundDecoration(i, i_11_, i_12_, -387297653);
		if (interface12 != null) {
			ObjectDefinitions class478 = IndexLoaders.MAP_REGION_DECODER.method4436(-1659848045).getObjectDefinitions(interface12.getId(-1741343457), 65280);
			int i_24_ = interface12.method92(-1014923705) & 0x3;
			if (class478.anInt5689 * -272332433 != -1)
				Class415.method6997(class505, class478, i_24_, i_13_, i_14_, 1254236729);
		}
	}

	static void method13043(int i, boolean bool, short i_25_) {
		Class282_Sub30 class282_sub30 = CS2Runner.method11127(i, bool, 1007335801);
		if (null != class282_sub30) {
			for (int i_26_ = 0; (i_26_ < ((Class282_Sub30) class282_sub30).anIntArray7710.length); i_26_++) {
				((Class282_Sub30) class282_sub30).anIntArray7710[i_26_] = -1;
				((Class282_Sub30) class282_sub30).anIntArray7709[i_26_] = 0;
			}
		}
	}

	static final void method13044(CS2Executor class527, int i) {
		if (null != client.aString7359)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = client.aString7359;
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
	}

	public static String method13045(long l, int i, int i_27_) {
		Class155.method2634(l);
		int i_28_ = Class407.aCalendar4848.get(5);
		int i_29_ = Class407.aCalendar4848.get(2);
		int i_30_ = Class407.aCalendar4848.get(1);
		if (i == 3)
			return Class93.method1578(l, i, (byte) 8);
		return new StringBuilder().append(Integer.toString(i_28_ / 10)).append(i_28_ % 10).append("-").append(Class407.aStringArrayArray4849[i][i_29_]).append("-").append(i_30_).toString();
	}

	static final void method13046(CS2Executor class527, int i) {
		if (null != Class113.aClass282_Sub4_1235) {
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = 1;
			class527.aClass282_Sub4_7011 = Class113.aClass282_Sub4_1235;
		} else
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = 0;
	}

	public static void method13047(int[] is, int[] is_31_, int i, int i_32_, byte i_33_) {
		if (i < i_32_) {
			int i_34_ = (i + i_32_) / 2;
			int i_35_ = i;
			int i_36_ = is[i_34_];
			is[i_34_] = is[i_32_];
			is[i_32_] = i_36_;
			int i_37_ = is_31_[i_34_];
			is_31_[i_34_] = is_31_[i_32_];
			is_31_[i_32_] = i_37_;
			int i_38_ = i_36_ == 2147483647 ? 0 : 1;
			for (int i_39_ = i; i_39_ < i_32_; i_39_++) {
				if (is[i_39_] < i_36_ + (i_39_ & i_38_)) {
					int i_40_ = is[i_39_];
					is[i_39_] = is[i_35_];
					is[i_35_] = i_40_;
					int i_41_ = is_31_[i_39_];
					is_31_[i_39_] = is_31_[i_35_];
					is_31_[i_35_++] = i_41_;
				}
			}
			is[i_32_] = is[i_35_];
			is[i_35_] = i_36_;
			is_31_[i_32_] = is_31_[i_35_];
			is_31_[i_35_] = i_37_;
			method13047(is, is_31_, i, i_35_ - 1, (byte) 34);
			method13047(is, is_31_, 1 + i_35_, i_32_, (byte) 95);
		}
	}
}
