-- SPDX-License-Identifier: MIT
-- Copyright (C) 2018-present iced project and contributors

-- ⚠️This file was generated by GENERATOR!🦹‍♂️

---Instruction condition code (used by `Jcc`, `SETcc`, `CMOVcc`, `LOOPcc`)
return {
	---The instruction doesn't have a condition code
	None = 0,
	---Overflow (`OF=1`)
	o = 1,
	---Not overflow (`OF=0`)
	no = 2,
	---Below (unsigned) (`CF=1`)
	b = 3,
	---Above or equal (unsigned) (`CF=0`)
	ae = 4,
	---Equal / zero (`ZF=1`)
	e = 5,
	---Not equal / zero (`ZF=0`)
	ne = 6,
	---Below or equal (unsigned) (`CF=1 or ZF=1`)
	be = 7,
	---Above (unsigned) (`CF=0 and ZF=0`)
	a = 8,
	---Signed (`SF=1`)
	s = 9,
	---Not signed (`SF=0`)
	ns = 10,
	---Parity (`PF=1`)
	p = 11,
	---Not parity (`PF=0`)
	np = 12,
	---Less (signed) (`SF!=OF`)
	l = 13,
	---Greater than or equal (signed) (`SF=OF`)
	ge = 14,
	---Less than or equal (signed) (`ZF=1 or SF!=OF`)
	le = 15,
	---Greater (signed) (`ZF=0 and SF=OF`)
	g = 16,
}
