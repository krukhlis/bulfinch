package com.stuffwithstuff.bulfinch;

public class NameExpr implements Expr {
  public NameExpr(final String name) {
    mName = new Name(name);
  }

  public Name getName() {
    return mName;
  }

  @Override
  public String toString() {
    return mName.getIdentifier();
  }

  public <A> void accept(ExprVisitor<A> visitor, A arg) {
    visitor.visit(this, arg);
  }

  private final Name mName;
}
