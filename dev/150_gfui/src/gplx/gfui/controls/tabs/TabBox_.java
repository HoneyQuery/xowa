/*
XOWA: the XOWA Offline Wiki Application
Copyright (C) 2012-2017 gnosygnu@gmail.com

XOWA is licensed under the terms of the General Public License (GPL) Version 3,
or alternatively under the terms of the Apache License Version 2.0.

You may use XOWA according to either of these licenses as is most appropriate
for your project on a case-by-case basis.

The terms of each license can be found in the source code repository:

GPLv3 License: https://github.com/gnosygnu/xowa/blob/master/LICENSE-GPLv3.txt
Apache License: https://github.com/gnosygnu/xowa/blob/master/LICENSE-APACHE2.txt
*/
package gplx.gfui.controls.tabs; import gplx.*; import gplx.gfui.*; import gplx.gfui.controls.*;
import gplx.gfui.controls.elems.*;
public class TabBox_ {
	public static TabBox as_(Object obj) {return obj instanceof TabBox ? (TabBox)obj : null;}
	public static TabBox cast(Object obj) {try {return (TabBox)obj;} catch(Exception exc) {throw Err_.new_type_mismatch_w_exc(exc, TabBox.class, obj);}}
	public static TabBox new_() {
		TabBox rv = new TabBox();
		rv.ctor_GfuiBox_base(GfuiElem_.init_focusAble_false_());
		return rv;
	}
	public static int Cycle(boolean fwd, int val, int max) {
		if (fwd)
			return val == max - 1 ? 0 : val + 1;
		else
			return val == 0 ? max - 1 : val - 1;
	}
}
