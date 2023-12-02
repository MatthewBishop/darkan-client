package com.rs.jagex;

public class Class302 {

	static LoadingStage[] aClass387Array3557;
	static Interface27[] anInterface27Array3559;
	static int anInt3561;
	static long aLong3562;
	static int anInt3563;
	static int[] anIntArray3558 = {4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1};
	static int anInt3560 = -1;
	static int anInt3564 = -1;

	static void handleMovementAnimations(PathingEntity animable, int moveType, int i_2, int i_3) {
		BASDefinitions renderAnim = animable.getRenderAnimDefs();
		MovingAnimation animation = animable.aAnimation_Sub3_10337;
		int turnDirection = animable.turnDirection - animable.aClass19_10359.turnDirection & 0x3fff;
		if (moveType == MoveSpeed.STATIONARY.id) {
			if (turnDirection == 0 && animable.turningTicks <= 25) {
				if (!animation.aBool7891 || !renderAnim.method3810(animation.method7597())) {
					animation.animate(renderAnim.getStandAnimation());
					animation.aBool7891 = animation.hasDefs();
				}
			} else if (i_3 < 0 && renderAnim.standing_ccw_turn != -1) {
				animation.animate(renderAnim.standing_ccw_turn);
				animation.aBool7891 = false;
			} else if (i_3 > 0 && renderAnim.standing_cw_turn != -1) {
				animation.animate(renderAnim.standing_cw_turn);
				animation.aBool7891 = false;
			} else if (!animation.aBool7891 || !renderAnim.method3810(animation.method7597())) {
				animation.animate(renderAnim.getStandAnimation());
				animation.aBool7891 = animable.aAnimation_Sub3_10337.hasDefs();
			}
		} else if (animable.faceEntity == -1 || turnDirection < 10240 && turnDirection > 2048) {
			if (turnDirection == 0 && animable.turningTicks <= 25) {
				if (moveType == MoveSpeed.RUNNING.id && renderAnim.run_anim != -1)
					animation.animate(renderAnim.run_anim);
				else if (moveType == MoveSpeed.HALF_WALK.id && renderAnim.slow_walk_anim != -1)
					animation.animate(renderAnim.slow_walk_anim);
				else
					animation.animate(renderAnim.walk_animation);
			} else if (moveType == MoveSpeed.RUNNING.id && renderAnim.run_anim != -1) {
				if (i_3 < 0 && renderAnim.run_ccw_turn_anim != -1)
					animation.animate(renderAnim.run_ccw_turn_anim);
				else if (i_3 > 0 && renderAnim.run_cw_turn_anim != -1)
					animation.animate(renderAnim.run_cw_turn_anim);
				else
					animation.animate(renderAnim.run_anim);
			} else if (moveType == MoveSpeed.HALF_WALK.id && renderAnim.slow_walk_anim != -1) {
				if (i_3 < 0 && renderAnim.slow_walk_ccw_turn_anim != -1)
					animation.animate(renderAnim.slow_walk_ccw_turn_anim);
				else if (i_3 > 0 && renderAnim.slow_walk_cw_turn_anim != -1)
					animation.animate(renderAnim.slow_walk_cw_turn_anim);
				else
					animation.animate(renderAnim.slow_walk_anim);
			} else if (i_3 < 0 && renderAnim.walk_ccw_turn_anim != -1)
				animation.animate(renderAnim.walk_ccw_turn_anim);
			else if (i_3 > 0 && renderAnim.walk_cw_turn_anim != -1)
				animation.animate(renderAnim.walk_cw_turn_anim);
			else
				animation.animate(renderAnim.walk_animation);
			animation.aBool7891 = false;
		} else {
			int walkDirection = client.NPC_TURN_DIRECTIONS[i_2] - animable.aClass19_10359.turnDirection & 0x3fff;
			if (moveType == MoveSpeed.RUNNING.id && renderAnim.run_anim != -1) {
				if (walkDirection > 2048 && walkDirection <= 6144 && renderAnim.run_follow_cw_turn_anim != -1)
					animation.animate(renderAnim.run_follow_cw_turn_anim);
				else if (walkDirection >= 10240 && walkDirection < 14336 && renderAnim.run_follow_ccw_turn_anim != -1)
					animation.animate(renderAnim.run_follow_ccw_turn_anim);
				else if (walkDirection > 6144 && walkDirection < 10240 && renderAnim.run_follow_full_turn_anim != -1)
					animation.animate(renderAnim.run_follow_full_turn_anim);
				else
					animation.animate(renderAnim.run_anim);
			} else if (moveType == MoveSpeed.HALF_WALK.id && renderAnim.slow_walk_anim != -1) {
				if (walkDirection > 2048 && walkDirection <= 6144 && renderAnim.slow_walk_follow_cw_turn_anim != -1)
					animation.animate(renderAnim.slow_walk_follow_cw_turn_anim);
				else if (walkDirection >= 10240 && walkDirection < 14336 && renderAnim.slow_walk_follow_ccw_turn_anim != -1)
					animation.animate(renderAnim.slow_walk_follow_ccw_turn_anim);
				else if (walkDirection > 6144 && walkDirection < 10240 && renderAnim.slow_walk_follow_full_turn_anim != -1)
					animation.animate(renderAnim.slow_walk_follow_full_turn_anim);
				else
					animation.animate(renderAnim.slow_walk_anim);
			} else if (walkDirection > 2048 && walkDirection <= 6144 && renderAnim.walk_follow_cw_turn_anim != -1)
				animation.animate(renderAnim.walk_follow_cw_turn_anim);
			else if (walkDirection >= 10240 && walkDirection < 14336 && renderAnim.walk_follow_ccw_turn_anim != -1)
				animation.animate(renderAnim.walk_follow_ccw_turn_anim);
			else if (walkDirection > 6144 && walkDirection < 10240 && renderAnim.walk_follow_full_turn_anim != -1)
				animation.animate(renderAnim.walk_follow_full_turn_anim);
			else
				animation.animate(renderAnim.walk_animation);
			animation.aBool7891 = false;
		}
	}

	static int method5360(int i_0, int i_1) {
		int i_3 = i_0 >> 31 & i_1 - 1;
			return (i_0 + (i_0 >>> 31)) % i_1 + i_3;
	}

	public static int method5364(int i_0, int i_1, float f_2) {
		return FontRenderer_Sub3.method14337(i_0, i_1, (int) f_2);
	}

	public static long runeDateToTimestamp(int days) {
		return (days + 11745) * 86400000L;
	}

	Class302() throws Throwable {
		throw new Error();
	}
}
