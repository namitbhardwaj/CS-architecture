	.data
a:
	70
	80
	40
	20
	10
	30
	50
	60
n:
	8
	.text
main:
    load %x0, $n, %x7
loop:
    addi %x0, 0, %x3
    addi %x0, 1, %x4
    subi %x7, 1, %x7
    beq %x7, 0, exitloop
    load %x0, $n, %x8
smallloop:
    subi %x8, 1, %x8
    beq %x8, 0, loop
    load %x3, $a, %x5
    load %x4, $a, %x6
    blt %x5, %x6, swap
    store %x5, 0, $x3
    store %x6, 0, %x4
    addi %x3, 1, %x3
    addi %x4, 1, %x4
    jmp smallloop
outerloop:
    jmp loop
swap:
    add %x5, %x0, %x9
    add %x6, %x0, %x5
    add %x9, %x0, %x6
    store %x5, 0, $x3
    store %x6, 0, %x4
    addi %x3, 1, %x3
    addi %x4, 1, %x4
    jmp smallloop
exitloop:
    end