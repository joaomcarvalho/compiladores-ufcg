program test;

procedure compute(x, y: integer);
var
	z: integer = -+-+25;
begin
    z := y - -((-x / +y)) * (+y mod -x);
end;

function soma(x, y: integer; var ref: string): integer;
var
	z: integer;
begin
    z := x + y;
    soma := z;
end;

var 
	a: string;
	b1: boolean;
	s, e, i, soma_res: integer;
	arr: array[1..10] of boolean;
	matrix: array of array of integer;

begin
    a := 'Can''t stop, won''t stop!';
    
    s := 10;
    e := 20;
    b1 := true;
    
    for i := s to e do
    	begin
    		b1 := not b1;
    		i := i + 1;
		end;
		
    compute(1, 2);
    soma_res := soma(1, 2, a);
end.
