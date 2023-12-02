package com.rs.jagex;

import java.util.Iterator;

public class BASDefinitions {

	static int anInt2831;
	public int renderAnimId;
	public int stand_animation = -1;
	public int walk_animation = -1;
	public int slow_walk_anim = -1;
	public int slow_walk_follow_full_turn_anim = -1;
	public int slow_walk_follow_ccw_turn_anim = -1;
	public int slow_walk_follow_cw_turn_anim = -1;
	public int run_anim = -1;
	public int run_follow_full_turn_anim = -1;
	public int run_follow_ccw_turn_anim = -1;
	public int run_follow_cw_turn_anim = -1;
	public int hill_width;
	public int hill_height;
	public int[] inv_item_slots;
	public int[][] equipmentTransforms;
	public int yaw_acceleration;
	public int yaw_max_speed;
	public int roll_acceleration;
	public int roll_max_speed;
	public int roll_target_angle;
	public int pitch_acceleration;
	public int pitch_max_speed;
	public int pitch_target_angle;
	public int movement_acceleration = -1;
	public int standing_ccw_turn = -1;
	public int standing_cw_turn = -1;
	public int walk_follow_full_turn_anim = -1;
	public int walk_follow_ccw_turn_anim = -1;
	public int walk_follow_cw_turn_anim = -1;
	public int character_height = -1;
	public int slow_walk_ccw_turn_anim = -1;
	public int slow_walk_cw_turn_anim = -1;
	public int run_ccw_turn_anim = -1;
	public int run_cw_turn_anim = -1;
	public int walk_ccw_turn_anim = -1;
	public int walk_cw_turn_anim = -1;
	public int[] idle_anims;
	public int[] idle_anim_weight;
	public boolean animate_shadow = true;
	public int hill_max_angle_x;
	public int hill_max_angle_z;
	public int[] max_equipment_rotation;
	public int[][] spotAnimOffsets;
	RenderAnimIndexLoader aClass211_2788;
	int totalChance;
	Matrix44Var[] matrices;

	public int getStandAnimation() {
		if (stand_animation != -1)
			return stand_animation;
		if (idle_anims == null)
			return -1;
		else {
			int i_2 = (int) (Math.random() * totalChance);
			int i_3;
			for (i_3 = 0; i_2 >= idle_anim_weight[i_3]; i_3++)
				i_2 -= idle_anim_weight[i_3];
			return idle_anims[i_3];
		}
	}

	void method3808(ByteBuf rsbytebuffer_1, int i_2) {
		if (i_2 == 1) {
			stand_animation = rsbytebuffer_1.readBigSmart();
			walk_animation = rsbytebuffer_1.readBigSmart();
		} else if (i_2 == 2)
			slow_walk_anim = rsbytebuffer_1.readBigSmart();
		else if (i_2 == 3)
			slow_walk_follow_full_turn_anim = rsbytebuffer_1.readBigSmart();
		else if (i_2 == 4)
			slow_walk_follow_ccw_turn_anim = rsbytebuffer_1.readBigSmart();
		else if (i_2 == 5)
			slow_walk_follow_cw_turn_anim = rsbytebuffer_1.readBigSmart();
		else if (i_2 == 6)
			run_anim = rsbytebuffer_1.readBigSmart();
		else if (i_2 == 7)
			run_follow_full_turn_anim = rsbytebuffer_1.readBigSmart();
		else if (i_2 == 8)
			run_follow_ccw_turn_anim = rsbytebuffer_1.readBigSmart();
		else if (i_2 == 9)
			run_follow_cw_turn_anim = rsbytebuffer_1.readBigSmart();
		else if (i_2 == 26) {
			hill_width = (short) (rsbytebuffer_1.readUnsignedByte() * 4);
			hill_height = (short) (rsbytebuffer_1.readUnsignedByte() * 4);
		} else {
			int i_4;
			int i_5;
			if (i_2 == 27) {
				if (equipmentTransforms == null)
					equipmentTransforms = new int[aClass211_2788.aClass526_2672.hidden.length][];
				i_4 = rsbytebuffer_1.readUnsignedByte();
				equipmentTransforms[i_4] = new int[6];
				for (i_5 = 0; i_5 < 6; i_5++)
					equipmentTransforms[i_4][i_5] = rsbytebuffer_1.readShort();
			} else if (i_2 == 28) {
				i_4 = rsbytebuffer_1.readUnsignedByte();
				inv_item_slots = new int[i_4];
				for (i_5 = 0; i_5 < i_4; i_5++) {
					inv_item_slots[i_5] = rsbytebuffer_1.readUnsignedByte();
					if (inv_item_slots[i_5] == 255)
						inv_item_slots[i_5] = -1;
				}
			} else if (i_2 == 29)
				yaw_acceleration = rsbytebuffer_1.readUnsignedByte();
			else if (i_2 == 30)
				yaw_max_speed = rsbytebuffer_1.readUnsignedShort();
			else if (i_2 == 31)
				roll_acceleration = rsbytebuffer_1.readUnsignedByte();
			else if (i_2 == 32)
				roll_max_speed = rsbytebuffer_1.readUnsignedShort();
			else if (i_2 == 33)
				roll_target_angle = rsbytebuffer_1.readShort();
			else if (i_2 == 34)
				pitch_acceleration = rsbytebuffer_1.readUnsignedByte();
			else if (i_2 == 35)
				pitch_max_speed = rsbytebuffer_1.readUnsignedShort();
			else if (i_2 == 36)
				pitch_target_angle = rsbytebuffer_1.readShort();
			else if (i_2 == 37)
				movement_acceleration = rsbytebuffer_1.readUnsignedByte();
			else if (i_2 == 38)
				standing_ccw_turn = rsbytebuffer_1.readBigSmart();
			else if (i_2 == 39)
				standing_cw_turn = rsbytebuffer_1.readBigSmart();
			else if (i_2 == 40)
				walk_follow_full_turn_anim = rsbytebuffer_1.readBigSmart();
			else if (i_2 == 41)
				walk_follow_ccw_turn_anim = rsbytebuffer_1.readBigSmart();
			else if (i_2 == 42)
				walk_follow_cw_turn_anim = rsbytebuffer_1.readBigSmart();
			else if ((i_2 == 43) || (i_2 == 44))
				rsbytebuffer_1.readUnsignedShort();
			else if (i_2 == 45)
				character_height = rsbytebuffer_1.readUnsignedShort();
			else if (i_2 == 46)
				slow_walk_ccw_turn_anim = rsbytebuffer_1.readBigSmart();
			else if (i_2 == 47)
				slow_walk_cw_turn_anim = rsbytebuffer_1.readBigSmart();
			else if (i_2 == 48)
				run_ccw_turn_anim = rsbytebuffer_1.readBigSmart();
			else if (i_2 == 49)
				run_cw_turn_anim = rsbytebuffer_1.readBigSmart();
			else if (i_2 == 50)
				walk_ccw_turn_anim = rsbytebuffer_1.readBigSmart();
			else if (i_2 == 51)
				walk_cw_turn_anim = rsbytebuffer_1.readBigSmart();
			else if (i_2 == 52) {
				i_4 = rsbytebuffer_1.readUnsignedByte();
				idle_anims = new int[i_4];
				idle_anim_weight = new int[i_4];
				for (i_5 = 0; i_5 < i_4; i_5++) {
					idle_anims[i_5] = rsbytebuffer_1.readBigSmart();
					int i_6 = rsbytebuffer_1.readUnsignedByte();
					idle_anim_weight[i_5] = i_6;
					totalChance += i_6;
				}
			} else if (i_2 == 53)
				animate_shadow = false;
			else if (i_2 == 54) {
				hill_max_angle_x = rsbytebuffer_1.readUnsignedByte() << 6;
				hill_max_angle_z = rsbytebuffer_1.readUnsignedByte() << 6;
			} else if (i_2 == 55) {
				if (max_equipment_rotation == null)
					max_equipment_rotation = new int[aClass211_2788.aClass526_2672.hidden.length];
				i_4 = rsbytebuffer_1.readUnsignedByte();
				max_equipment_rotation[i_4] = rsbytebuffer_1.readUnsignedShort();
			} else if (i_2 == 56) {
				if (spotAnimOffsets == null)
					spotAnimOffsets = new int[aClass211_2788.aClass526_2672.hidden.length][];
				i_4 = rsbytebuffer_1.readUnsignedByte();
				spotAnimOffsets[i_4] = new int[3];
				for (i_5 = 0; i_5 < 3; i_5++)
					spotAnimOffsets[i_4][i_5] = rsbytebuffer_1.readShort();
			}
		}
	}

	public boolean method3810(int i_1) {
		if (i_1 == -1)
			return false;
		if (stand_animation == i_1)
			return true;
		else {
			if (idle_anims != null)
				for (int randomStandAnimation : idle_anims)
					if (randomStandAnimation == i_1)
						return true;
			return false;
		}
	}

	public Matrix44Var[] method3811() {
		if (matrices != null)
			return matrices;
		if (equipmentTransforms == null)
			return null;
		else {
			matrices = new Matrix44Var[equipmentTransforms.length];
			for (int i = 0; i < equipmentTransforms.length; i++) {
				int i_3 = 0;
				int i_4 = 0;
				int i_5 = 0;
				int xRot = 0;
				int yRot = 0;
				int zRot = 0;
				if (equipmentTransforms[i] != null) {
					i_3 = equipmentTransforms[i][0];
					i_4 = equipmentTransforms[i][1];
					i_5 = equipmentTransforms[i][2];
					xRot = equipmentTransforms[i][3] << 3;
					yRot = equipmentTransforms[i][4] << 3;
					zRot = equipmentTransforms[i][5] << 3;
				}
				if (i_3 != 0 || i_4 != 0 || i_5 != 0 || xRot != 0 || yRot != 0 || zRot != 0) {
					Matrix44Var matrix = matrices[i] = new Matrix44Var();
					if (zRot != 0)
						matrix.rotation(0.0F, 0.0F, 1.0F, Trig.degToRad(zRot));
					if (xRot != 0)
						matrix.rotation(1.0F, 0.0F, 0.0F, Trig.degToRad(xRot));
					if (yRot != 0)
						matrix.rotation(0.0F, 1.0F, 0.0F, Trig.degToRad(yRot));
					matrix.method5219(i_3, i_4, i_5);
				}
			}
			return matrices;
		}
	}

	void method3821(ByteBuf rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0)
				return;
			method3808(rsbytebuffer_1, i_3);
		}
	}

	public int[] method3828() {
		IterableNodeMap<Node> iterablenodemap_2 = new IterableNodeMap<>(16);
		AccountCreationStage.method253(stand_animation, iterablenodemap_2);
		int[] ints_3;
		int i_4;
		if (idle_anims != null) {
			ints_3 = idle_anims;
			for (i_4 = 0; i_4 < ints_3.length; i_4++) {
				int i_7 = ints_3[i_4];
				AccountCreationStage.method253(i_7, iterablenodemap_2);
			}
		}
		AccountCreationStage.method253(standing_ccw_turn, iterablenodemap_2);
		AccountCreationStage.method253(standing_cw_turn, iterablenodemap_2);
		AccountCreationStage.method253(walk_animation, iterablenodemap_2);
		AccountCreationStage.method253(walk_follow_full_turn_anim, iterablenodemap_2);
		AccountCreationStage.method253(walk_follow_ccw_turn_anim, iterablenodemap_2);
		AccountCreationStage.method253(walk_follow_cw_turn_anim, iterablenodemap_2);
		AccountCreationStage.method253(run_anim, iterablenodemap_2);
		AccountCreationStage.method253(run_follow_full_turn_anim, iterablenodemap_2);
		AccountCreationStage.method253(run_follow_ccw_turn_anim, iterablenodemap_2);
		AccountCreationStage.method253(run_follow_cw_turn_anim, iterablenodemap_2);
		AccountCreationStage.method253(slow_walk_anim, iterablenodemap_2);
		AccountCreationStage.method253(slow_walk_follow_full_turn_anim, iterablenodemap_2);
		AccountCreationStage.method253(slow_walk_follow_ccw_turn_anim, iterablenodemap_2);
		AccountCreationStage.method253(slow_walk_follow_cw_turn_anim, iterablenodemap_2);
		AccountCreationStage.method253(slow_walk_ccw_turn_anim, iterablenodemap_2);
		AccountCreationStage.method253(slow_walk_cw_turn_anim, iterablenodemap_2);
		AccountCreationStage.method253(run_ccw_turn_anim, iterablenodemap_2);
		AccountCreationStage.method253(run_cw_turn_anim, iterablenodemap_2);
		AccountCreationStage.method253(walk_ccw_turn_anim, iterablenodemap_2);
		AccountCreationStage.method253(walk_cw_turn_anim, iterablenodemap_2);
		ints_3 = new int[iterablenodemap_2.size()];
		i_4 = 0;
		Node node_6;
		for (Iterator<Node> iterator_5 = iterablenodemap_2.iterator(); iterator_5.hasNext(); ints_3[i_4++] = (int) node_6.pointer)
			node_6 = iterator_5.next();
		return ints_3;
	}
}
