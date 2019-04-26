import java.util.HashMap;

public enum CS2OpInfo {
	PUSH_INT(79, true),
	LOAD_VARP(154, true),
	STORE_VARP(929, true),
	PUSH_STRING(57, true),
	GOTO(123, true),
	INT_NE(693, true),
	INT_EQ(933, true),
	INT_LT(566, true),
	INT_GT(939, true),
	GET_VARP_OLD(267, true), //TODO LOOK INTO THIS
	GET_VARPBIT_OLD(827, true), //TODO LOOK INTO THIS
	GET_VARN_OLD(229, true), //TODO LOOK INTO THIS
	GET_VARNBIT_OLD(526, true), //TODO LOOK INTO THIS
	RETURN(184),
	LOAD_VARPBIT(408, true),
	STORE_VARPBIT(371, true),
	INT_LE(670, true),
	INT_GE(319, true),
	LOAD_INT(500, true),
	STORE_INT(168, true),
	LOAD_STRING(799, true),
	STORE_STRING(356, true),
	MERGE_STRINGS(531, true),
	POP_INT(492),
	POP_STRING(354),
	CALL_CS2(902, true),
	LOAD_VARC(311, true),
	STORE_VARC(510, true),
	ARRAY_NEW(235, true),
	ARRAY_LOAD(859, true),
	ARRAY_STORE(116, true),
	LOAD_VARC_STRING(700, true),
	STORE_VARC_STRING(21, true),
	SWITCH(377, true),
	PUSH_LONG(633, true),
	POP_LONG(539, true),
	LOAD_LONG(473, true),
	STORE_LONG(987, true),
	LONG_NE(908, true),
	LONG_EQ(381, true),
	LONG_LT(597, true),
	LONG_GT(237, true),
	LONG_LE(465, true),
	LONG_GE(142, true),
	BRANCH_EQ1(195, true), //JUMP if 1?
	BRANCH_EQ0(836, true), //JUMP if 0?
	LOAD_CLAN_VAR(717, true),
	LOAD_CLAN_VARBIT(220, true),
	LOAD_CLAN_VAR_LONG(215, true),
	LOAD_CLAN_VAR_STRING(995, true),
	LOAD_CLAN_SETTING_VAR(73, true),
	LOAD_CLAN_SETTING_VARBIT(147, true),
	LOAD_CLAN_SETTING_VAR_LONG(83, true),
	LOAD_CLAN_SETTING_VAR_STRING(910, true),
	instr6137(113),
	instr6001(981),
	CLEAR_COMP_CHILDREN(572),
	instr6003(677),
	instr6004(333),
	instr6438(515),
	instr6006(246),
	instr6007(993),
	instr6008(584),
	instr6009(326),
	instr6419(502),
	instr6011(613),
	instr6012(156),
	instr6635(325),
	instr6014(925),
	instr6146(847),
	instr6016(140),
	instr6118(112),
	instr6018(341),
	instr6019(787),
	instr6020(126),
	instr6626(274),
	instr6022(402),
	instr6023(320),
	instr6024(124),
	instr6025(415),
	instr6026(196),
	instr6027(406),
	instr6475(872),
	instr6683(528),
	instr6055(32),
	instr6031(363),
	instr6032(911),
	instr6033(972),
	instr6034(351),
	instr6817(546),
	instr6036(103),
	instr6037(644),
	instr6038(317),
	instr6039(751),
	instr6532(599),
	instr6098(185),
	instr6831(28),
	instr6043(209),
	instr6914(159),
	instr6045(965),
	instr6079(24),
	instr6047(77),
	instr6048(497),
	instr6049(639),
	instr6050(513),
	instr6051(100),
	instr6052(589),
	instr6053(579),
	instr6198(476),
	instr6909(606),
	instr6068(924),
	instr6057(13),
	instr6306(542),
	instr6059(186),
	instr6105(470),
	instr6665(133),
	instr6912(412),
	instr6063(591),
	instr6064(314),
	instr6065(878),
	instr6066(173),
	instr6895(928),
	instr6618(443),
	instr6244(998),
	instr6070(834),
	instr6071(671),
	instr6676(68),
	instr6073(345),
	instr6443(764),
	instr6075(223),
	instr6076(275),
	instr6110(466),
	instr6179(611),
	instr6218(627),
	instr6080(176),
	instr6081(806),
	instr6737(659),
	instr6083(66),
	instr6258(749),
	instr6085(895),
	instr6086(67),
	instr6087(219),
	instr6088(813),
	instr5957(158),
	instr6450(374),
	instr6091(1),
	instr6092(665),
	instr6224(705),
	instr6094(892),
	instr6095(697),
	instr6556(957),
	instr6687(457),
	instr6499(392),
	instr6084(708),
	instr6346(207),
	instr6452(191),
	instr6899(886),
	instr6103(991),
	instr6765(615),
	instr6370(807),
	instr6106(695),
	instr6580(323),
	instr6437(59),
	instr6903(841),
	instr6099(883),
	instr6111(719),
	instr6112(490),
	instr6113(440),
	instr6492(652),
	instr6096(315),
	instr6116(70),
	instr6054(525),
	instr6782(916),
	instr6119(505),
	instr6120(544),
	instr6121(702),
	instr6552(797),
	instr6772(523),
	instr6124(545),
	instr6125(796),
	instr6344(747),
	instr6462(204),
	instr6128(626),
	instr6762(451),
	instr6130(494),
	instr6131(755),
	instr6132(979),
	instr6133(680),
	instr6134(829),
	instr6135(0),
	instr6901(491),
	instr6529(648),
	instr6670(555),
	instr6139(34),
	instr6005(97),
	instr6262(728),
	instr6928(449),
	instr6771(832),
	instr6144(723),
	instr6230(664),
	instr6566(160),
	instr6842(472),
	instr6148(137),
	instr6636(36),
	instr6150(3),
	instr6151(620),
	instr6585(467),
	instr6153(75),
	instr6154(125),
	instr6155(694),
	instr6662(707),
	instr6157(989),
	SET_COMP_POS(937),
	instr6934(982),
	HIDE_COMP(590),
	instr6161(434),
	instr6706(668),
	instr6163(825),
	instr6164(816),
	instr6165(918),
	SET_COMP_TRANSPARENCY(763),
	instr6167(530),
	SET_COMP_SPRITE(529),
	instr6169(205),
	instr6142(460),
	instr6171(488),
	instr6056(605),
	ANIMATE_COMP(690),
	instr6174(824),
	instr6369(82),
	SET_COMP_TEXT(724),
	instr6177(85),
	instr6178(741),
	instr6170(689),
	instr6180(651),
	instr6181(344),
	instr6182(131),
	instr6183(503),
	instr6184(774),
	instr6185(628),
	instr6216(368),
	instr6187(527),
	instr6188(760),
	instr6377(862),
	instr6190(432),
	instr6191(369),
	instr6192(198),
	instr6193(479),
	instr6194(206),
	instr6195(194),
	instr6196(950),
	instr6197(316),
	instr6387(224),
	instr6199(388),
	instr6200(857),
	instr6201(783),
	instr6715(845),
	instr6864(547),
	instr6879(72),
	instr6205(203),
	instr6919(598),
	instr6207(518),
	instr6208(352),
	instr6209(744),
	instr6210(499),
	instr6129(552),
	instr6793(898),
	instr6213(255),
	instr6214(899),
	instr6215(495),
	instr5969(98),
	instr6217(413),
	instr6569(289),
	instr6219(583),
	instr6220(512),
	instr6221(896),
	instr6222(122),
	instr6223(790),
	instr6888(805),
	instr6136(222),
	instr6226(127),
	instr6477(739),
	instr6228(903),
	instr6229(786),
	HOOK_MOUSE_PRESS(881),
	instr6231(143),
	instr6232(382),
	HOOK_MOUSE_ENTER(968),
	HOOK_MOUSE_EXIT(600),
	instr6235(478),
	instr6527(770),
	instr6237(244),
	instr6342(300),
	instr6239(172),
	instr6240(926),
	instr5973(287),
	HOOK_MOUSE_HOVER(753),
	instr6243(809),
	instr6393(486),
	instr6376(758),
	instr6246(550),
	instr6247(683),
	instr6248(730),
	instr6708(76),
	instr6250(625),
	instr6251(416),
	instr6252(179),
	instr6253(532),
	instr6254(947),
	instr6255(630),
	instr6256(321),
	instr6257(189),
	instr6507(768),
	instr6259(508),
	instr6260(401),
	instr6261(111),
	instr6898(105),
	instr6263(64),
	instr6398(710),
	instr6265(170),
	GET_COMP_WIDTH(263),
	GET_COMP_HEIGHT(953),
	instr6268(578),
	instr6269(135),
	instr6270(692),
	instr6271(798),
	instr6272(932),
	instr6273(428),
	GET_COMP_TEXT(748),
	instr6275(496),
	instr6276(978),
	instr6277(38),
	instr6292(461),
	instr6279(96),
	instr6280(436),
	instr6281(912),
	instr6544(721),
	instr6283(463),
	instr6284(169),
	instr6072(624),
	instr6159(864),
	instr6287(870),
	instr6288(997),
	instr6289(543),
	instr6290(808),
	instr6875(373),
	instr6805(888),
	instr6293(1000),
	instr6294(448),
	instr6295(331),
	instr6296(704),
	instr6297(164),
	instr6298(996),
	instr6299(197),
	instr6300(163),
	instr6391(52),
	instr6302(941),
	instr6303(588),
	instr6304(948),
	instr6646(999),
	instr6186(882),
	instr6307(167),
	instr6002(736),
	instr6309(250),
	instr6625(471),
	instr6311(245),
	instr6312(574),
	instr6313(117),
	instr6314(216),
	instr6315(4),
	instr6140(162),
	instr6317(18),
	instr6318(259),
	instr6910(304),
	instr6320(360),
	instr6321(291),
	instr6322(637),
	instr6040(913),
	instr6324(211),
	instr6325(238),
	instr6326(101),
	PLAY_SOUND_EFFECT(2),
	instr6480(855),
	instr6329(920),
	instr6330(784),
	instr6619(780),
	instr6332(145),
	instr6333(516),
	instr6334(959),
	instr6788(535),
	instr6336(395),
	instr6337(80),
	instr6338(180),
	instr6339(138),
	instr6810(485),
	instr6341(157),
	instr6467(192),
	instr6343(301),
	instr6701(340),
	instr6345(772),
	instr6067(389),
	instr6865(93),
	instr6348(298),
	instr6349(536),
	instr6385(336),
	instr6351(612),
	instr6575(720),
	instr6353(771),
	instr6354(727),
	GET_SYSTEM_UPDATE_TIMER(715),
	instr6356(601),
	instr6357(944),
	instr6358(866),
	instr6359(81),
	instr6360(718),
	instr6361(262),
	instr6362(139),
	instr6457(657),
	instr6364(427),
	instr6693(20),
	instr6366(696),
	instr6713(524),
	instr6734(202),
	instr6327(48),
	instr6168(25),
	instr6528(930),
	instr6604(619),
	instr6373(781),
	instr6374(655),
	instr6375(243),
	instr6889(308),
	instr6143(115),
	instr6378(366),
	instr6379(50),
	instr6077(980),
	instr6381(426),
	instr6382(214),
	instr6383(453),
	instr6384(554),
	instr6396(814),
	instr6819(820),
	instr6896(540),
	instr6593(60),
	instr6389(840),
	GET_ENUM_SIZE(533),
	instr6945(149),
	instr6392(438),
	instr6367(904),
	instr6705(86),
	instr6395(364),
	instr6942(121),
	instr6397(511),
	instr6690(183),
	instr6763(252),
	instr6932(51),
	instr6401(732),
	instr6402(562),
	instr6403(647),
	instr6399(609),
	instr6405(914),
	instr6758(177),
	instr6407(871),
	instr6944(879),
	instr6409(767),
	instr6282(765),
	instr6411(1002),
	instr6412(699),
	instr6413(587),
	instr6414(394),
	instr6415(346),
	instr6897(421),
	instr6417(854),
	instr6926(293),
	instr6093(682),
	instr6420(735),
	instr6421(284),
	instr6422(966),
	instr6423(802),
	instr6424(338),
	instr6061(943),
	instr6426(880),
	instr6427(520),
	instr6428(667),
	instr6429(954),
	instr6430(629),
	instr6431(580),
	instr6432(37),
	instr6029(656),
	instr6434(833),
	instr6435(452),
	instr6436(815),
	instr6491(843),
	instr6841(91),
	instr6264(894),
	instr6440(549),
	instr6441(200),
	instr6442(706),
	instr6769(541),
	instr6444(166),
	instr6445(411),
	instr6446(746),
	instr6447(861),
	instr6448(962),
	instr6830(7),
	instr6160(557),
	instr6854(956),
	instr6114(104),
	instr6453(838),
	instr6454(884),
	instr6455(347),
	instr6931(370),
	instr6531(907),
	instr6787(489),
	instr6459(399),
	instr6460(444),
	instr6461(673),
	instr6245(23),
	instr5984(350),
	instr6464(897),
	instr6465(5),
	instr6147(559),
	instr6316(414),
	instr6468(602),
	instr6469(575),
	instr6340(27),
	instr6471(480),
	instr6472(687),
	instr6372(650),
	instr6474(733),
	instr6109(984),
	instr6266(361),
	ADD_INT(279),
	SUBTRACT_INT(130),
	MULTIPLY_INT(367),
	DIVIDE_INT(56),
	instr6481(675),
	instr6482(851),
	instr6479(190),
	instr6484(890),
	instr6485(119),
	instr6564(873),
	instr6487(278),
	MOD_INT(178),
	instr6347(645),
	instr6490(776),
	BIT_AND(199),
	instr6732(474),
	MIN_INT(538),
	MAX_INT(750),
	instr6495(277),
	instr6418(729),
	instr6497(586),
	instr6498(534),
	instr6541(310),
	instr6500(286),
	instr6501(573),
	instr6502(874),
	LOWER_STRING(556),
	instr6504(618),
	instr6505(709),
	INT_TO_STRING(688),
	STRING_EQUAL(810),
	instr6152(469),
	instr6801(43),
	instr6510(15),
	instr6511(49),
	instr6512(701),
	instr6513(638),
	instr6514(150),
	instr6515(801),
	instr6516(934),
	STRING_LENGTH(247),
	instr6518(108),
	instr6519(41),
	instr6520(593),
	instr6521(844),
	instr6522(977),
	instr6523(153),
	instr6795(280),
	instr6820(459),
	instr6881(339),
	instr6319(454),
	instr6100(385),
	instr6749(128),
	instr6893(949),
	instr6380(89),
	instr6335(905),
	instr6533(94),
	instr6534(313),
	instr6508(22),
	instr6408(756),
	instr6537(384),
	instr6538(822),
	instr6539(120),
	instr6540(45),
	instr6145(800),
	instr6542(623),
	instr6104(146),
	instr6291(249),
	instr6545(754),
	instr6546(264),
	instr6547(481),
	instr6548(213),
	instr6549(425),
	instr6550(935),
	GET_STRUCT_VALUE(594),
	instr6947(404),
	instr6553(456),
	instr6554(643),
	instr6555(990),
	instr6458(777),
	instr6746(860),
	instr6558(424),
	SEND_REPORT_ABUSE_PACKET(257),
	instr6560(231),
	instr6739(681),
	instr6562(792),
	instr6563(118),
	instr6010(134),
	instr6211(743),
	instr6189(789),
	instr6624(622),
	instr6565(335),
	instr6796(292),
	instr6526(839),
	instr6225(961),
	instr6572(482),
	instr6573(462),
	instr6574(309),
	instr6682(327),
	instr6249(272),
	instr6577(867),
	instr6578(927),
	instr6202(946),
	instr6030(988),
	instr6581(10),
	instr6425(604),
	instr6583(328),
	instr6584(958),
	instr6069(661),
	instr6586(187),
	instr6587(329),
	instr6588(909),
	instr6368(922),
	instr6590(713),
	instr6591(994),
	instr6592(208),
	instr6449(188),
	instr6594(795),
	instr6595(324),
	instr6596(109),
	instr6597(217),
	instr6598(349),
	instr6599(711),
	instr6613(830),
	instr6601(227),
	instr6602(285),
	instr6603(663),
	instr6233(290),
	instr6716(759),
	instr6606(334),
	instr6607(386),
	instr6608(731),
	instr6308(84),
	instr6610(397),
	instr6611(726),
	instr6612(16),
	instr6849(560),
	instr6614(405),
	instr6615(306),
	instr6616(788),
	instr6617(674),
	instr6090(441),
	instr6074(975),
	instr6620(923),
	instr6621(676),
	instr6439(410),
	instr6685(823),
	instr6638(228),
	instr6212(603),
	instr5966(260),
	instr6206(970),
	instr6628(641),
	instr6238(475),
	instr6630(969),
	instr6631(662),
	instr6632(288),
	instr6633(74),
	instr6634(901),
	instr6582(35),
	instr6671(775),
	instr6637(514),
	instr6818(210),
	instr6639(785),
	instr6488(175),
	instr6704(141),
	instr6404(596),
	instr6643(691),
	instr6644(297),
	instr6645(818),
	instr6406(617),
	instr6647(649),
	instr6648(577),
	instr6649(234),
	instr6650(567),
	instr6651(46),
	instr6652(595),
	instr6653(716),
	instr6654(951),
	instr6655(355),
	instr6656(318),
	instr6657(6),
	instr6658(431),
	instr6666(110),
	instr6660(65),
	instr6661(61),
	instr6866(565),
	instr6416(477),
	instr6410(672),
	instr5956(853),
	instr6780(964),
	instr6667(343),
	instr6668(359),
	CHECK_JAVA_VERSION(826),
	instr6044(1004),
	instr6923(973),
	instr6672(400),
	instr6673(435),
	instr6451(521),
	instr6675(570),
	instr6162(99),
	instr6677(107),
	instr6678(940),
	instr6679(144),
	instr6456(493),
	instr6681(161),
	instr6663(893),
	instr6108(868),
	instr6684(483),
	instr6823(8),
	instr6686(155),
	instr6331(931),
	instr6627(722),
	instr6236(396),
	instr6013(365),
	instr6122(151),
	instr6692(831),
	instr6204(273),
	instr6694(171),
	SEND_VERIFY_EMAIL_PACKET(654),
	SEND_SIGNUP_FORM_PACKET(686),
	instr6697(362),
	instr6698(684),
	instr6699(1003),
	instr6700(9),
	instr6323(92),
	instr6702(742),
	instr6703(498),
	instr6774(551),
	instr6641(182),
	instr6305(422),
	instr6707(19),
	instr6623(242),
	instr6709(945),
	instr6710(447),
	instr6711(391),
	instr6712(569),
	instr6642(885),
	instr6714(666),
	instr6576(875),
	instr6101(44),
	instr6717(509),
	instr6718(869),
	instr6719(506),
	instr6720(917),
	instr6721(357),
	instr6722(849),
	instr6609(484),
	instr6724(372),
	instr6725(537),
	instr6726(71),
	instr6727(226),
	instr6860(270),
	instr6729(281),
	instr6730(232),
	instr6731(685),
	instr6674(269),
	instr6733(383),
	instr6741(358),
	instr6735(276),
	instr6736(417),
	instr6525(992),
	instr6738(703),
	instr5993(380),
	instr6740(376),
	instr6557(564),
	instr6742(181),
	instr6743(553),
	instr6744(464),
	instr6745(348),
	instr6922(261),
	instr6747(90),
	instr6748(218),
	instr6570(568),
	instr6750(632),
	instr6629(455),
	instr6752(817),
	instr6948(332),
	instr6754(848),
	instr6285(983),
	instr6756(268),
	instr6688(254),
	instr6489(585),
	instr6759(646),
	instr6785(390),
	instr6761(891),
	GET_WATER_PREFERENCE(487),
	instr6060(193),
	instr6938(782),
	instr6755(26),
	instr6766(828),
	instr6767(942),
	instr6768(919),
	instr5975(712),
	instr6770(458),
	instr6605(582),
	instr6640(752),
	instr6773(387),
	instr6925(794),
	instr5954(419),
	instr6600(725),
	instr6777(734),
	instr6778(804),
	instr6286(418),
	instr6400(30),
	instr6781(714),
	instr6301(971),
	instr6783(353),
	instr6784(42),
	instr6941(132),
	instr6786(240),
	instr6775(737),
	instr6097(423),
	instr6789(581),
	instr6790(607),
	instr6764(745),
	instr6792(47),
	instr6141(936),
	instr6486(403),
	instr5988(283),
	instr6365(55),
	instr6797(519),
	instr6798(636),
	instr6799(793),
	instr6800(877),
	instr6821(17),
	instr6802(256),
	instr6803(233),
	instr6227(212),
	instr6829(915),
	instr6806(239),
	instr6807(960),
	instr6808(296),
	instr6809(658),
	SET_PING_WORLDS(678),
	instr6589(303),
	instr6812(271),
	instr6813(342),
	instr6950(738),
	instr6815(136),
	instr6816(40),
	instr6015(307),
	instr6386(429),
	instr6659(305),
	instr6794(653),
	instr6278(561),
	instr6890(294),
	instr6350(819),
	instr6824(251),
	instr6825(31),
	instr6826(778),
	instr6827(266),
	instr6828(906),
	instr6920(445),
	instr5955(437),
	instr6696(985),
	instr6832(631),
	instr6833(757),
	instr6834(976),
	instr6835(230),
	instr6836(201),
	instr6837(148),
	instr6509(379),
	instr6839(241),
	instr6840(236),
	instr6536(78),
	instr6483(54),
	instr6843(679),
	instr6844(522),
	instr6845(769),
	instr6846(407),
	instr6847(253),
	instr6848(393),
	instr6496(887),
	instr6850(265),
	instr6851(375),
	instr6852(1005),
	instr6853(398),
	instr6310(837),
	instr6855(225),
	instr6394(955),
	instr6857(312),
	instr6858(773),
	instr6859(952),
	instr6046(174),
	instr6861(88),
	instr6862(762),
	instr6863(548),
	instr6838(766),
	instr6680(507),
	instr6476(576),
	instr6867(106),
	instr6868(420),
	instr6869(337),
	instr6058(63),
	instr6871(761),
	instr6779(129),
	instr6873(640),
	instr6874(635),
	instr6041(621),
	instr6876(803),
	instr6877(221),
	instr6878(610),
	instr6776(504),
	instr6880(938),
	instr6822(446),
	instr6882(563),
	instr6883(258),
	instr6884(850),
	instr6885(821),
	instr6886(114),
	instr6887(1001),
	instr6760(58),
	instr6156(442),
	instr6123(900),
	instr6891(876),
	instr6892(571),
	instr6872(501),
	instr6894(865),
	instr6622(33),
	instr5997(921),
	instr6543(409),
	instr6433(779),
	instr6173(616),
	instr6900(53),
	instr6388(430),
	instr6902(282),
	instr6203(378),
	instr6904(812),
	instr6905(740),
	instr6906(29),
	instr6907(660),
	instr6908(165),
	instr6664(330),
	instr5946(811),
	instr6911(669),
	instr6028(248),
	instr6913(634),
	instr6107(322),
	instr6915(852),
	instr6916(986),
	instr6917(974),
	instr6918(439),
	instr6102(450),
	instr6126(433),
	instr6921(295),
	instr6000(69),
	instr6751(517),
	instr6924(95),
	instr6728(558),
	instr6021(87),
	instr6089(791),
	instr6463(889),
	instr6929(842),
	instr6930(468),
	instr6371(863),
	instr6723(608),
	instr6933(14),
	instr6535(642),
	instr6935(856),
	instr6936(846),
	instr6937(967),
	instr6042(102),
	instr6939(614),
	instr6940(39),
	instr6691(592),
	instr6062(698),
	instr6943(302),
	instr6352(299),
	instr6078(11),
	instr6946(835),
	instr6241(858),
	instr6571(152),
	instr6949(12),
	instr6927(963),
	instr6951(62);

	private static HashMap<Integer, CS2OpInfo> OPCODES = new HashMap<>();
	
	static {
		for (CS2OpInfo op : CS2OpInfo.values()) {
			OPCODES.put(op.opcode, op);
		}
	}
	
	public static CS2OpInfo getByOpcode(int id) {
		return OPCODES.get(id);
	}
	
	public int opcode;
	public boolean hasIntConstant;

	private CS2OpInfo(int opcode) {
		this(opcode, false);
	}

	private CS2OpInfo(int opcode, boolean hasIntConstant) {
		this.opcode = opcode;
		this.hasIntConstant = hasIntConstant;
	}

	public int getOpcode() {
		return opcode;
	}

	public boolean hasIntConstant() {
		return hasIntConstant;
	}
}
