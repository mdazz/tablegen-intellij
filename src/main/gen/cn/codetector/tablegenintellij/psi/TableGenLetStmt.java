// This is a generated file. Not intended for manual editing.
package cn.codetector.tablegenintellij.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TableGenLetStmt extends PsiElement {

  @NotNull
  TableGenLetList getLetList();

  @NotNull
  List<TableGenStatement> getStatementList();

}
