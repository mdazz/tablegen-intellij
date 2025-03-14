// This is a generated file. Not intended for manual editing.
package cn.codetector.tablegenintellij.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static cn.codetector.tablegenintellij.psi.TableGenTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import cn.codetector.tablegenintellij.psi.*;

public class TableGenMultiClassStatementImpl extends ASTWrapperPsiElement implements TableGenMultiClassStatement {

  public TableGenMultiClassStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TableGenVisitor visitor) {
    visitor.visitMultiClassStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TableGenVisitor) accept((TableGenVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TableGenAssertStmt getAssertStmt() {
    return findChildByClass(TableGenAssertStmt.class);
  }

  @Override
  @Nullable
  public TableGenDefStmt getDefStmt() {
    return findChildByClass(TableGenDefStmt.class);
  }

  @Override
  @Nullable
  public TableGenDefmStmt getDefmStmt() {
    return findChildByClass(TableGenDefmStmt.class);
  }

  @Override
  @Nullable
  public TableGenDefvarStmt getDefvarStmt() {
    return findChildByClass(TableGenDefvarStmt.class);
  }

  @Override
  @Nullable
  public TableGenForEachStmt getForEachStmt() {
    return findChildByClass(TableGenForEachStmt.class);
  }

  @Override
  @Nullable
  public TableGenIfStmt getIfStmt() {
    return findChildByClass(TableGenIfStmt.class);
  }

  @Override
  @Nullable
  public TableGenLetStmt getLetStmt() {
    return findChildByClass(TableGenLetStmt.class);
  }

}
