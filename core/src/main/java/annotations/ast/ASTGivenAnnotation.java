package annotations.ast;

import com.fujitsu.vdmj.ast.annotations.ASTAnnotation;
import com.fujitsu.vdmj.ast.lex.LexIdentifierToken;

public class ASTGivenAnnotation extends ASTAnnotation {

    private static final long serialVersionUID = 1L;

    public ASTGivenAnnotation(LexIdentifierToken name) {
        super(name);
    }
    public static void doInit()
	{
		
	}


}
