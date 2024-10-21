package lc1106_parsing_boolean_expression

/*
1106. Parsing A Boolean Expression
https://leetcode.com/problems/parsing-a-boolean-expression/description/?envType=daily-question&envId=2024-10-20
*/
type node struct {
	ch   rune
	next *node
}
type stack struct {
	size int
	head *node
}

func push(st *stack, ch rune) {
	if st.head == nil {
		st.head = &node{ch: ch}
	} else {
		newNode := &node{ch: ch}
		next := st.head
		st.head = newNode
		newNode.next = next
	}
	st.size++
}
func pop(st *stack) rune {
	p := st.head
	st.head = st.head.next
	result := p.ch
	st.size--
	return result
}

func parseBoolExpr(expression string) bool {
	st := new(stack)
	str := []rune(expression)
	for i := 0; i < len(str); i++ {
		switch str[i] {
		case ',':
			break
		case ')':
			or := 'f'
			and := 't'
			p := ' '
			for st.size > 0 {
				ch := pop(st)
				if ch == '(' {
					exp := pop(st)
					if exp == '&' {
						push(st, and)
					} else if exp == '|' {
						push(st, or)
					} else {
						if p == 'f' {
							push(st, 't')
						} else {
							push(st, 'f')
						}
					}
					break
				} else {
					if ch == 'f' {
						and = 'f'
					} else {
						or = 't'
					}
					p = ch
				}
			}
			break
		default:
			push(st, str[i])
			break
		}
	}
	if pop(st) == 't' {
		return true
	} else {
		return false
	}
}
