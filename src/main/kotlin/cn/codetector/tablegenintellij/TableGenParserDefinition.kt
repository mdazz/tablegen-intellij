package cn.codetector.tablegenintellij

import cn.codetector.tablegenintellij.parser.TableGenParser
import cn.codetector.tablegenintellij.psi.TableGenTypes
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lang.WhitespaceSkippedCallback
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

class TableGenParserDefinition : ParserDefinition {

    val WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE)
    val BLOCK_COMMENT = TokenSet.create(TableGenTypes.BLOCK_COMMENT)
    val LINE_COMMENT = TokenSet.create(TableGenTypes.LINE_COMMENT)

    val FILE = IFileElementType(TableGenLanguage.INSTANCE)

    override fun createParser(project: Project?): PsiParser = TableGenParser()

    override fun createFile(viewProvider: FileViewProvider): PsiFile = TableGenFile(viewProvider)

    override fun getStringLiteralElements(): TokenSet =
        TokenSet.EMPTY

    override fun getFileNodeType(): IFileElementType = FILE

    override fun createLexer(project: Project?): Lexer =
        TableGenLexerAdapter()

    override fun createElement(node: ASTNode?): PsiElement =
        TableGenTypes.Factory.createElement(node)

    override fun getCommentTokens(): TokenSet = TokenSet.orSet(BLOCK_COMMENT, LINE_COMMENT)

    override fun getWhitespaceTokens(): TokenSet = WHITE_SPACES
}