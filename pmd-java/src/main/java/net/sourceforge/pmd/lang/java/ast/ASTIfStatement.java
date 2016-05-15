/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
/* Generated By:JJTree: Do not edit this line. ASTIfStatement.java */

package net.sourceforge.pmd.lang.java.ast;

public class ASTIfStatement extends AbstractJavaNode {

    private boolean hasElse;

    public ASTIfStatement(int id) {
        super(id);
    }

    public ASTIfStatement(JavaParser p, int id) {
        super(p, id);
    }

    public void setHasElse() {
        this.hasElse = true;
    }

    public boolean hasElse() {
        return this.hasElse;
    }

    /**
     * Accept the visitor. *
     */
    @Override
    public Object jjtAccept(JavaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
