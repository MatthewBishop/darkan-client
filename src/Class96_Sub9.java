public class Class96_Sub9 extends Class96 {

	static AccountCreationResponseOpcodes RECIEVED_RESPONSE;
	static int anInt9282;
	int anInt9280;
	int anInt9279;
	Class116 aClass116_9281;

	Class96_Sub9(RsByteBuffer rsbytebuffer_1) {
		super(rsbytebuffer_1);
		this.anInt9280 = rsbytebuffer_1.readUnsignedShort();
		this.anInt9279 = rsbytebuffer_1.readUnsignedByte();
	}

	boolean method1599() {
		if (this.aClass116_9281 == null) {
			this.aClass116_9281 = new Class116(IndexLoaders.MUSIC_INDEX, this.anInt9280);
		}

		return this.aClass116_9281.method1963();
	}

	public void method1601() {
		Class256.method4412(this.aClass116_9281, 68269153 * this.anInt9279 * -321392735, 1541193543);
	}

	public void method1592() {
		Class256.method4412(this.aClass116_9281, this.anInt9279, 1212110524);
	}

	public static boolean method14585(int i_0) {
		return i_0 == (i_0 & -i_0);
	}

	static final void method14586(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (Class96_Sub14.method14642(string_4, cs2executor_2, -159099843) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}

		icomponentdefinitions_0.anObjectArray1396 = Class351.method6193(string_4, cs2executor_2, -448612500);
		icomponentdefinitions_0.aBool1384 = true;
	}

}
