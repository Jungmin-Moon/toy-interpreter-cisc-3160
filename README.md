Intrepreter project for end of semester course. 

That would be able to handle: 
------------------------------------------------------------------
Program:
	Assignment*

Assignment:
	Identifier = Exp;

Exp: 
	Exp + Term | Exp - Term | Term

Term:
	Term * Fact  | Fact

Fact:
	( Exp ) | - Fact | + Fact | Literal | Identifier

Identifier:
     	Letter [Letter | Digit]*

Letter:
	a|...|z|A|...|Z|_

Literal:
	0 | NonZeroDigit Digit*
		
NonZeroDigit:
	1|...|9

Digit:
	0|1|...|9
 ----------------------------------------------------------------
 Incomplete, will not be able to fully do more than one statement at present. 
