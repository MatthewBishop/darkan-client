public class Class404 {

	static Interface36 LIBRARY_LOADER;
	static Class466 aClass466_4831;

	Class404() throws Throwable {
		throw new Error();
	}

	public static final void method6809(String string_0, int i_1) {
		BufferedConnectionContext class184_3 = Class468_Sub20.method12807(-19463532);
		TCPMessage tcpmessage_4 = Class271.method4828(OutgoingPacket.aClass379_4534, class184_3.isaac, -295409729);
		tcpmessage_4.buffer.writeByte(1 + ChatLine.getLength(string_0));
		tcpmessage_4.buffer.write128Byte(i_1, 2009148363);
		tcpmessage_4.buffer.writeString(string_0);
		class184_3.method3049(tcpmessage_4, -116955034);
	}

	static void method6810(int i_0) {
		if (Class20.aClass282_Sub50_Sub15_163 != null) {
			Class20.aClass282_Sub50_Sub15_163 = null;
			Class292.method5201(Class341.anInt3996, Class282_Sub50_Sub2.anInt9471, Class96_Sub3.anInt8518, Class521_Sub1_Sub5_Sub1.anInt10526);
		}

	}

	public static final void method6811(int i_0) {
		if (Class113.CLAN_CHANNEL != null && i_0 >= 0 && i_0 < Class113.CLAN_CHANNEL.numPlayers) {
			ClanChannelPlayer class57_2 = Class113.CLAN_CHANNEL.players[i_0];
			if (class57_2.rank == -1) {
				BufferedConnectionContext class184_3 = Class468_Sub20.method12807(2122526956);
				TCPMessage tcpmessage_4 = Class271.method4828(OutgoingPacket.aClass379_4630, class184_3.isaac, -301971618);
				tcpmessage_4.buffer.writeByte(2 + ChatLine.getLength(class57_2.name));
				tcpmessage_4.buffer.writeShort(i_0);
				tcpmessage_4.buffer.writeString(class57_2.name);
				class184_3.method3049(tcpmessage_4, 1522960717);
			}
		}

	}

}
