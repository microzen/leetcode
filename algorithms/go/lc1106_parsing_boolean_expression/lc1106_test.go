package lc1106_parsing_boolean_expression

import "testing"

func TestParseBoolExpr(t *testing.T) {

	str := "&(|(f))"
	if parseBoolExpr(str) != false {
		t.Fatalf(str)
	}
	str = "|(f,f,f,t)"
	if parseBoolExpr(str) != true {
		t.Fatalf(str)
	}
	str = "|(&(t,f,t),!(t))"
	if parseBoolExpr(str) != false {
		t.Fatalf(str)
	}
}
