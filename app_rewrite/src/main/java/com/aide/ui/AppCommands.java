package com.aide.ui;

import abcd.*;

import io.github.zeroaicy.aide.extend.OpenAideTermux;
import io.github.zeroaicy.aide.utils.FilesRenameMenu;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class AppCommands {

	//空的
    private static sf[] v5 = new sf[0];
    private static sf[] Hw = new sf[0];

	//u7的重复过滤器
    private static HashSet<Class<?>> commandSet = new HashSet<>();

	//所有
    private static List<sf> allCommands = new ArrayList<>();


	//会包含在所有集合中
    private static sf[] j6;

	private static sf[] VH;
    private static sf[] Zo;
    private static sf[] FH;
    private static sf[] DW;


    private static List<bg> EQ = new ArrayList<>();
    private static List<bg> tp = new ArrayList<>();
    private static List<bg> J8 = new ArrayList<>();

    private static List<bg> we = new ArrayList<>();

	//
	private static List<bg> J0 = new ArrayList<>();

    static {
        try {
			//空的
            j6(Hw, we);
            j6(v5, J0);

			//会添加所有
            j6 = new sf[]{OpenAideTermux.getSingleton(), new lb(), new ob(), new kb(),
				new mb(), new jb(), new pc(), new cb(), new xa(), new dc(), new vc(), 
				new uc(), new tc(), new wc(), new ec(), new wb(), new ub(), new hc(), 
				new i9(), new g9(), new ca(), new bc(), new gb()};

			// 文件浏览器
			DW = new sf[]{new s9(), new ib(), new nb(), 
				new qc(), new a9(), new r9(), new oa(), 
				new oc(), new yc(), new nc(), 
				new FilesRenameMenu(), new v9(), 
				new m9(), new q9(), new p9(), 
				new ic(), new z8(), new xb(), 
				new ta(), new ua(), new qa(), 
				new sa(), new pa(), new ra(), new na()};



			FH = new sf[]{new ga(), new ia(), new fa(), 
				new ha(), new f9(), new tb(), new cc(), 
				new e9(), new n9()};


			Zo = new sf[]{new aa(), new kc(), new b9(), 
				new rc(), new j9(), new z9(), new y9(),
				new cd()};
				
			//
            VH = new sf[]{new c9(), new h9(), new pb(), 
				new mc(), new lc(), new hb(), new wa(), 
				new va(), new za(), new ab(), new bb(), 
				new sc(), new fc(), new ac(), new gc(), 
				new x9(), new bd(), new vb(), new u9(), 
				new l9(), new sb(), new yb(), new ka(), 
				new d9(), new w9(), new ba(), new ya(), 
				new jc(), new la(), new ja(), new rb(), 
				new ad(), new db(), new eb(), new da(), 
				new ea(), new xc(), new t9(), new o9(), 
				new qb(), new ma(), new fb(), new k9(), 
				new zc()};

			j6(Zo, EQ);
            j6(VH, EQ);

			//文件浏览器
            j6(DW, tp);

            j6(FH, J8);

			//共5类
			j6(j6, EQ);
            j6(j6, tp);
            j6(j6, J8);

			j6(j6, we);
            j6(j6, J0);

        }
		catch (Throwable th) {
        }
    }

	private static List<rf> rf = null;
	public static List<rf> rf() {
		if (rf == null) {
			rf = new ArrayList<>();
			for (sf sfVar : Hw()) {
				if (sfVar instanceof rf) {
					rf.add((rf)sfVar);
				}
			}
		}
		return rf;
    }

	private static List<dg> dg;
	private static List<dg> dgList() {
		if (dg == null) {
			dg = new ArrayList<>();
			for (sf sfVar : Hw()) {
				if ((sfVar instanceof dg)) {
					dg.add(((dg)sfVar));
				}
			}
		}
		return dg;
	}

    public AppCommands() {}

	/**
	 * API
	 */

	/**
	 * 寻找rf
	 */
    public static rf DW(int id) {
		for (rf rfVar  : rf()) {
			if (id == rfVar.gn()) {
				return rfVar;
			}
		}
		return null;
    }

    public static dg u7(int id) {
		for (dg dgVar : dgList()) {
			if (id == dgVar.FH()) {
				return dgVar;
			}
		}
		return null;
    }
	private static List<tf> tf = null;
	public static List<tf> FH() {
		if (tf == null) {
			tf = new ArrayList<>();
			for (sf sfVar : Hw()) {
				if (sfVar instanceof tf) {
					tf.add((tf)sfVar);
				}
			}
		}
		return tf;
    }
	/**
	 * 字段 Zo, VH
	 */
    public static List<bg> v5() {
		return EQ;
    }

	/**
	 * 所有
	 */
    public static List<sf> Hw() {
		return allCommands;
    }


    public static List<bg> VH() {
		return tp;
    }
    public static List<bg> gn() {
		return J8;
    }

	/**
	 * 只有字段j6
	 */
    public static List<bg> Zo() {
		return we;
    }
	/**
	 * 只有字段j6
	 */
    public static List<bg> tp() {
		return J0;
    }

    private static void j6(sf[] sfVarArr, List<bg> list) {
        for (sf sfVar : sfVarArr) {
			if (sfVar instanceof bg) {
				list.add((bg) sfVar);
			}

			if (!commandSet.contains(sfVar.getClass())) {
				commandSet.add(sfVar.getClass());
				allCommands.add(sfVar);
			}
		}
    }




}

