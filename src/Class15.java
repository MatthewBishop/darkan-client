final class Class15 implements Interface35 {

	public Object method216(byte[] bytes_1, FontMetrics fontmetrics_2, boolean bool_3) {
		return Renderers.SOFTWARE_RENDERER.createFont(fontmetrics_2, Class91.method1517(bytes_1), bool_3);
	}

	public Object method215(byte[] bytes_1, FontMetrics fontmetrics_2, boolean bool_3) {
		return Renderers.SOFTWARE_RENDERER.createFont(fontmetrics_2, Class91.method1517(bytes_1), bool_3);
	}

	public Object method214(byte[] bytes_1, FontMetrics fontmetrics_2, boolean bool_3) {
		return Renderers.SOFTWARE_RENDERER.createFont(fontmetrics_2, Class91.method1517(bytes_1), bool_3);
	}

	public static void method540(int i_0, byte b_1) {
		if (i_0 < 0 || i_0 > 2) {
			i_0 = 0;
		}
		Class235.anInt2906 = i_0;
		Queue.aClass539Array5632 = new ParticleSystem[Class89.anIntArray931[Class235.anInt2906] + 1];
		Class235.anInt2899 = 0;
		Class235.anInt2901 = 0;
	}

	static final void method542(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (Class96_Sub14.method14642(string_4, cs2executor_2, 876649685) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.anObjectArray1407 = Class351.method6193(string_4, cs2executor_2, -479801764);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static void method544(IComponentDefinitions icomponentdefinitions_0, int i_1, int i_2, int i_3) {
		Class20.aClass118_183 = icomponentdefinitions_0;
		Class20.anInt195 = i_1;
		Class20.anInt179 = i_2;
	}

	static String method547(int[] ints_0, int i_1) {
		StringBuilder stringbuilder_2 = new StringBuilder();
		int i_3 = Class20.anInt186;
		for (int i_4 = 0; i_4 < ints_0.length; i_4++) {
			QuestDefinitions questdefinitions_5 = IndexLoaders.aClass242_4922.method4156(ints_0[i_4]);
			if (questdefinitions_5.anInt2977 != -1) {
				NativeSprite nativesprite_6 = (NativeSprite) Class20.aClass229_191.get((long) questdefinitions_5.anInt2977);
				if (nativesprite_6 == null) {
					Class91 class91_7 = Class91.method1522(IndexLoaders.SPRITES_INDEX, questdefinitions_5.anInt2977, 0);
					if (class91_7 != null) {
						nativesprite_6 = Renderers.SOFTWARE_RENDERER.method8444(class91_7, true);
						Class20.aClass229_191.put(nativesprite_6, (long) questdefinitions_5.anInt2977);
					}
				}
				if (nativesprite_6 != null) {
					Class115.aClass160Array1248[i_3] = nativesprite_6;
					stringbuilder_2.append(" <img=").append(i_3).append(">");
					++i_3;
				}
			}
		}
		return stringbuilder_2.toString();
	}

	public static void method549(Class397 class397_0, int i_1, SceneObject sceneobject_3) {
		CS2Executor cs2executor_5 = Class125.getNextScriptExecutor(1408358423);
		cs2executor_5.anInterface12_7013 = sceneobject_3;
		Class107.method1834(class397_0, i_1, -1, cs2executor_5, (byte) 23);
		cs2executor_5.anInterface12_7013 = null;
	}
}
