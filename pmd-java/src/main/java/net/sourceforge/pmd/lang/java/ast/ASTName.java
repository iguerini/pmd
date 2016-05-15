/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
/* Generated By:JJTree: Do not edit this line. ASTName.java */

package net.sourceforge.pmd.lang.java.ast;

import net.sourceforge.pmd.lang.symboltable.NameDeclaration;

public class ASTName extends AbstractJavaTypeNode {

    private NameDeclaration nd;

    public ASTName(int id) {
        super(id);
    }

    public ASTName(JavaParser p, int id) {
        super(p, id);
    }

    public void setNameDeclaration(NameDeclaration nd) {
        this.nd = nd;
    }

    public NameDeclaration getNameDeclaration() {
        return this.nd;
    }


    /**
     * Accept the visitor. *
     */
    @Override
    public Object jjtAccept(JavaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
