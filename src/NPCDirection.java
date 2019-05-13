public enum NPCDirection implements Identifiable {
	NORTH(0, 0),
	EAST(2, 1),
	SOUTH_EAST(3, 2),
	NORTH_WEST(7, 3),
	SOUTH(6, 4),
	WEST(4, 5),
	NORTH_EAST(5, 6),
	SOUTH_WEST(1, 7);
	
	public int value;
	int direction;

	public NPCDirection method4317() {
		switch (this.value) {
		case 0:
			return SOUTH;
		case 1:
			return NORTH_WEST;
		case 2:
			return WEST;
		case 3:
			return NORTH_EAST;
		case 4:
			return EAST;
		case 5:
			return SOUTH_EAST;
		case 6:
			return NORTH;
		case 7:
			return SOUTH_WEST;
		default:
			throw new IllegalStateException();
		}
	}

	NPCDirection(int i_1, int i_2) {
		this.value = i_1;
		this.direction = i_2;
	}

	public int getValue() {
		return this.direction;
	}

	static int method4325(WorldDescriptor class217_sub1_0, WorldDescriptor class217_sub1_1, int i_2, boolean bool_3, int i_4, boolean bool_5) {
		int i_7 = Preference_Sub1.method12620(class217_sub1_0, class217_sub1_1, i_2, bool_3, -1139598282);
		if (i_7 != 0) {
			return bool_3 ? -i_7 : i_7;
		} else if (i_4 == -1) {
			return 0;
		} else {
			int i_8 = Preference_Sub1.method12620(class217_sub1_0, class217_sub1_1, i_4, bool_5, 502697852);
			return bool_5 ? -i_8 : i_8;
		}
	}

	static void method4326(int i_0, int i_1, IComponentDefinitions icomponentdefinitions_2) {
		int i_4 = icomponentdefinitions_2.width + i_0;
		int i_5 = i_1 + 15;
		if (client.aBool7176) {
			int i_6 = -256;
			if (client.FPS < 20) {
				i_6 = -65536;
			}
			Class16.aFontRenderer_144.method359("Fps:" + client.FPS, i_4, i_5, i_6, -1);
			i_5 += 15;
			Runtime runtime_7 = Runtime.getRuntime();
			long long_8 = runtime_7.totalMemory() / 1024L;
			long long_10 = long_8 - runtime_7.freeMemory() / 1024L;
			int i_12 = -256;
			if (long_10 > 262144L) {
				i_12 = -65536;
			}
			Class16.aFontRenderer_144.method359("Mem:" + long_10 + "/" + long_8 + "k", i_4, i_5, i_12, -1);
			i_5 += 15;
			long long_13 = client.outputContext.aClass7_2299.method349((byte) 16);
			String str_15 = "N/A";
			if (long_13 != -1L) {
				str_15 = long_13 + "ms";
				if (long_13 > 500L) {
					str_15 = Utils.rgbToColHexShortcut(16711680) + str_15 + Utils.rgbToColHexShortcut(16776960);
				}
			}
			Class16.aFontRenderer_144.method359("Game: In:" + client.outputContext.anInt2294 + "B/s " + "Out:" + client.outputContext.anInt2293 + "B/s " + "Ping:" + str_15, i_4, i_5, -256, -1);
			i_5 += 15;
			long long_16 = client.connectionContext.aClass7_2299.method349((byte) -81);
			String str_18 = "N/A";
			if (long_16 != -1L) {
				str_18 = long_16 + "ms";
				if (long_16 > 500L) {
					str_18 = Utils.rgbToColHexShortcut(16711680) + str_18 + Utils.rgbToColHexShortcut(16776960);
				}
			}
			Class16.aFontRenderer_144.method359("Lobby: In:" + client.connectionContext.anInt2294 + "B/s " + "Out:" + client.connectionContext.anInt2293 + "B/s " + "Ping:" + str_18, i_4, i_5, -256, -1);
			i_5 += 15;
			int i_19 = Renderers.SOFTWARE_RENDERER.za() / 1024;
			Class16.aFontRenderer_144.method359("Offheap:" + i_19 + "k", i_4, i_5, i_19 > 65536 ? -65536 : -256, -1);
			i_5 += 15;
			int i_20 = 0;
			int i_21 = 0;
			int i_22 = 0;
			int i_23;
			for (i_23 = 0; i_23 < Class492.aClass327_Sub1Array5777.length; i_23++) {
				if (Class492.aClass327_Sub1Array5777[i_23] != null) {
					i_20 += Class492.aClass327_Sub1Array5777[i_23].method12541();
					i_21 += Class492.aClass327_Sub1Array5777[i_23].method12542();
					i_22 += Class492.aClass327_Sub1Array5777[i_23].method12559();
				}
			}
			i_23 = i_22 * 100 / i_20;
			int i_24 = i_21 * 10000 / i_20;
			String string_25 = "Cache:" + Connection.method3342((long) i_24, 2, true, Language.aClass495_5795, (byte) 28) + "% (" + i_23 + "%)";
			Renderers.FONT_RENDERER.method359(string_25, i_4, i_5, -256, -1);
			i_5 += 12;
		}
	}

	public static int containerTotalParam(int containerId, int paramId, boolean countStack) {
		ItemContainer container = ItemContainer.getContainer(containerId, false);
		if (container == null) {
			return 0;
		} else {
			int total = 0;
			for (int i = 0; i < container.itemIds.length; i++) {
				if (container.itemIds[i] >= 0 && container.itemIds[i] < IndexLoaders.ITEM_LOADER.maxItemsCount) {
					ItemDefinitions itemDef = IndexLoaders.ITEM_LOADER.getItemDefinitions(container.itemIds[i]);
					int param = itemDef.getCS2Integer(paramId, IndexLoaders.PARAM_LOADER.getParam(paramId).defaultInt);
					if (countStack) {
						total += param * container.amounts[i];
					} else {
						total += param;
					}
				}
			}
			return total;
		}
	}

	static Node_Sub20 method4328(int i_0) {
		switch (i_0) {
		case 0:
			return new Node_Sub20_Sub17();
		case 1:
			return new Node_Sub20_Sub21();
		case 2:
			return new Node_Sub20_Sub6();
		case 3:
			return new Node_Sub20_Sub18();
		case 4:
			return new Node_Sub20_Sub37();
		case 5:
			return new Node_Sub20_Sub16();
		case 6:
			return new Node_Sub20_Sub20();
		case 7:
			return new Node_Sub20_Sub27();
		case 8:
			return new Node_Sub20_Sub10();
		case 9:
			return new Node_Sub20_Sub23();
		case 10:
			return new Node_Sub20_Sub13();
		case 11:
			return new Node_Sub20_Sub35();
		case 12:
			return new Node_Sub20_Sub3();
		case 13:
			return new Node_Sub20_Sub38();
		case 14:
			return new Node_Sub20_Sub25();
		case 15:
			return new Node_Sub20_Sub34();
		case 16:
			return new Node_Sub20_Sub8();
		case 17:
			return new Node_Sub20_Sub32();
		case 18:
			return new Node_Sub20_Sub29_Sub1();
		case 19:
			return new Node_Sub20_Sub15();
		case 20:
			return new Node_Sub20_Sub2();
		case 21:
			return new Node_Sub20_Sub33();
		case 22:
			return new Node_Sub20_Sub31();
		case 23:
			return new Node_Sub20_Sub22();
		case 24:
			return new Node_Sub20_Sub30();
		case 25:
			return new Node_Sub20_Sub28();
		case 26:
			return new Node_Sub20_Sub11();
		case 27:
			return new Node_Sub20_Sub1();
		case 28:
			return new Node_Sub20_Sub9();
		case 29:
			return new Node_Sub20_Sub19();
		case 30:
			return new Node_Sub20_Sub7();
		case 31:
			return new Node_Sub20_Sub5();
		case 32:
			return new Node_Sub20_Sub12();
		case 33:
			return new Node_Sub20_Sub36();
		case 34:
			return new Node_Sub20_Sub4();
		case 35:
			return new Node_Sub20_Sub26();
		case 36:
			return new Node_Sub20_Sub24();
		case 37:
			return new Node_Sub20_Sub14();
		case 38:
			return new Node_Sub20_Sub39();
		case 39:
			return new Node_Sub20_Sub29();
		default:
			return null;
		}
	}
}
