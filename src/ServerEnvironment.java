public enum ServerEnvironment implements Identifiable {

    aClass496_5810("LOCAL", "", 4),
    aClass496_5807("WTWIP", "", 3),
    aClass496_5809("WTI", "", 5),
    aClass496_5808("WTQA", "", 2),
    aClass496_5811("WTRC", "", 1),
    aClass496_5812("INTBETA", "", 6),
    aClass496_5813("LIVE", "", 0);

    String aString5815;

    int anInt5814;

    ServerEnvironment(String string_1, String string_2, int i_3) {
        this.aString5815 = string_1;
        this.anInt5814 = i_3;
    }
    
    public int getValue() {
        return this.anInt5814;
    }

    public static boolean method8308(ServerEnvironment class496_0, int i_1) {
        return aClass496_5811 == class496_0 || aClass496_5808 == class496_0 || aClass496_5807 == class496_0 || aClass496_5809 == class496_0 || aClass496_5812 == class496_0;
    }

    static void method8309(RsByteBuffer rsbytebuffer_0, int i_1) {
        if (Engine.aClass440_3269 != null) {
            try {
                Engine.aClass440_3269.method7347(0L);
                Engine.aClass440_3269.method7352(rsbytebuffer_0.buffer, i_1, 24);
            } catch (Exception exception_4) {
                ;
            }
        }
    }

    static int method8313() {
        byte b_1;
        if (Engine.MAX_MEMORY >= 96) {
            int i_2 = Class241.getCPUProfile();
            if (i_2 <= 104) {
                EquipmentDefaults.method11248(1422604274);
                b_1 = 4;
            } else if (i_2 <= 504) {
                Node_Sub40.method13300(-273043210);
                b_1 = 3;
            } else if (i_2 <= 1002) {
                Class119.method2077(240785770);
                b_1 = 2;
            } else {
                Node_Sub20_Sub25.method15393(1945296321);
                b_1 = 1;
            }
        } else {
            Node_Sub20_Sub25.method15393(1593170502);
            b_1 = 1;
        }
        if (Class393.preferences.currentToolkit.getValue(-1431790545) != 0) {
            Class393.preferences.setValue(Class393.preferences.aPreference_Sub18_8214, 0);
            ParticleProducer.method11500(0, false);
        } else {
            Class393.preferences.method13505(Class393.preferences.currentToolkit, true, -1824777589);
        }
        Class190.savePreferences((byte) 44);
        return b_1;
    }

    public static void method8314(String string_0, int port) {
        if (Class448.lobbyConnectionInfo == null) {
            Class448.lobbyConnectionInfo = new ConnectionInfo();
        }
        Class448.lobbyConnectionInfo.host = string_0;
        Class448.lobbyConnectionInfo.worldId = port + 1099;
        Class448.lobbyConnectionInfo.anInt5434 = Class448.lobbyConnectionInfo.worldId;
        Class448.lobbyConnectionInfo.anInt5437 = Class448.lobbyConnectionInfo.worldId;
    }

    static final void method8315(int i_0) {
        if (client.anInt7349 != -1) {
            int i_1 = Class163.mouseRecorder.getMouseX();
            int i_2 = Class163.mouseRecorder.getMouseY();
            MouseRecord class282_sub53_3 = (MouseRecord) client.mouseRecords.head();
            if (class282_sub53_3 != null) {
                i_1 = class282_sub53_3.getX();
                i_2 = class282_sub53_3.getY();
            }
            if (client.aClass118_7257 != null && InputSubscriberType.aClass118_2763 == client.aClass118_7247) {
                client.aBool7403 = true;
                client.anInt7432 = 0;
                client.anInt7265 = 0;
                client.anInt7367 = Class349.anInt4083;
                client.anInt7476 = client.anInt3243 * -969250379;
            }
            LightIntensityIndexLoader.method7313((Node_Sub44) null, client.anInt7349, 0, 0, Class349.anInt4083, client.anInt3243 * -969250379, 0, 0, i_1, i_2, (byte) -112);
            if (Node_Sub20_Sub24.aClass118_9884 != null) {
                BillboardDefinitions.method6170(i_1, i_2);
            }
        }
    }
}
