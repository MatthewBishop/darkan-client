public class ParamDefinitions {

	public static NativeSprite aClass160_5339;
	char typeChar;
	public int defaultInt;
	public boolean autoDisable = true;
	public String typeName;

	void method7315(RsByteBuffer rsbytebuffer_1, int i_2) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}

			this.method7316(rsbytebuffer_1, i_3, (byte) 87);
		}
	}

	void method7316(RsByteBuffer rsbytebuffer_1, int i_2, byte b_3) {
		if (i_2 == 1) {
			this.typeChar = Class11.getChar(rsbytebuffer_1.readByte(), 1486768413);
		} else if (i_2 == 2) {
			this.defaultInt = rsbytebuffer_1.readInt();
		} else if (i_2 == 4) {
			this.autoDisable = false;
		} else if (i_2 == 5) {
			this.typeName = rsbytebuffer_1.readString();
		}

	}

	public boolean method7319(int i_1) {
		return this.typeChar == 115;
	}

	static final void method7322(CS2Executor cs2executor_0, int i_1) {
		Class520.method11160(Class507.method8727(-1377363314), cs2executor_0, 1060557669);
	}

	static void method7323(byte b_0) {
		if (Renderers.SOFTWARE_RENDERER != null) {
			IndexLoaders.MAP_REGION_DECODER.method4444(1684896059);
			Class58.method1139(-1956740427);
			Class76.method1361((byte) -9);
			Defaults8Loader.method11156(-1284329582);
			IndexLoaders.MAP_REGION_DECODER.method4446((byte) -33);
			Class217_Sub1.method13056(-1395275172);
			Class356.method6227(false, (byte) -17);
			Class225_Sub6.method13413(-1756133525);
			Class122.method2111(true, 662490589);
			ParticleProducerDefinition.method1160(-319039192);
			Class386.method6673(326422820);

			int i_1;
			for (i_1 = 0; i_1 < client.aClass281Array7180.length; i_1++) {
				Class281 class281_10000 = client.aClass281Array7180[i_1];
			}

			int i_3;
			for (i_1 = 0; i_1 < 2048; i_1++) {
				Player player_2 = client.players[i_1];
				if (player_2 != null) {
					for (i_3 = 0; i_3 < player_2.aClass528Array10372.length; i_3++) {
						player_2.aClass528Array10372[i_3] = null;
					}
				}
			}

			for (i_1 = 0; i_1 < client.anInt7210; i_1++) {
				NPC npc_4 = (NPC) client.aClass282_Sub47Array7209[i_1].anObject8068;
				if (npc_4 != null) {
					for (i_3 = 0; i_3 < npc_4.aClass528Array10372.length; i_3++) {
						npc_4.aClass528Array10372[i_3] = null;
					}
				}
			}

			client.aClass465_7334.method7749(835503641);
			Renderers.SOFTWARE_RENDERER.method8396(-2084829618);
			Renderers.SOFTWARE_RENDERER = null;
		}

	}

}