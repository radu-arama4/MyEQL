package com.company.EQL_ANTLR.Generated;// Generated from D:/UTM/SEMESTRUL 4/PBL/MyEQL/src\EQL.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EQLParser}.
 */
public interface EQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EQLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(EQLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(EQLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(EQLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(EQLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(EQLParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(EQLParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(EQLParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(EQLParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(EQLParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(EQLParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(EQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(EQLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(EQLParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(EQLParser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#destination}.
	 * @param ctx the parse tree
	 */
	void enterDestination(EQLParser.DestinationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#destination}.
	 * @param ctx the parse tree
	 */
	void exitDestination(EQLParser.DestinationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(EQLParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(EQLParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#subject}.
	 * @param ctx the parse tree
	 */
	void enterSubject(EQLParser.SubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#subject}.
	 * @param ctx the parse tree
	 */
	void exitSubject(EQLParser.SubjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(EQLParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(EQLParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(EQLParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(EQLParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#sorting}.
	 * @param ctx the parse tree
	 */
	void enterSorting(EQLParser.SortingContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#sorting}.
	 * @param ctx the parse tree
	 */
	void exitSorting(EQLParser.SortingContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#folder}.
	 * @param ctx the parse tree
	 */
	void enterFolder(EQLParser.FolderContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#folder}.
	 * @param ctx the parse tree
	 */
	void exitFolder(EQLParser.FolderContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#to}.
	 * @param ctx the parse tree
	 */
	void enterTo(EQLParser.ToContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#to}.
	 * @param ctx the parse tree
	 */
	void exitTo(EQLParser.ToContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#from}.
	 * @param ctx the parse tree
	 */
	void enterFrom(EQLParser.FromContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#from}.
	 * @param ctx the parse tree
	 */
	void exitFrom(EQLParser.FromContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#cc}.
	 * @param ctx the parse tree
	 */
	void enterCc(EQLParser.CcContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#cc}.
	 * @param ctx the parse tree
	 */
	void exitCc(EQLParser.CcContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#forwarded}.
	 * @param ctx the parse tree
	 */
	void enterForwarded(EQLParser.ForwardedContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#forwarded}.
	 * @param ctx the parse tree
	 */
	void exitForwarded(EQLParser.ForwardedContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(EQLParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(EQLParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(EQLParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(EQLParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#attachments}.
	 * @param ctx the parse tree
	 */
	void enterAttachments(EQLParser.AttachmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#attachments}.
	 * @param ctx the parse tree
	 */
	void exitAttachments(EQLParser.AttachmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#datevalue}.
	 * @param ctx the parse tree
	 */
	void enterDatevalue(EQLParser.DatevalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#datevalue}.
	 * @param ctx the parse tree
	 */
	void exitDatevalue(EQLParser.DatevalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#subjectvalue}.
	 * @param ctx the parse tree
	 */
	void enterSubjectvalue(EQLParser.SubjectvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#subjectvalue}.
	 * @param ctx the parse tree
	 */
	void exitSubjectvalue(EQLParser.SubjectvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#sortingvalue}.
	 * @param ctx the parse tree
	 */
	void enterSortingvalue(EQLParser.SortingvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#sortingvalue}.
	 * @param ctx the parse tree
	 */
	void exitSortingvalue(EQLParser.SortingvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#foldervalue}.
	 * @param ctx the parse tree
	 */
	void enterFoldervalue(EQLParser.FoldervalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#foldervalue}.
	 * @param ctx the parse tree
	 */
	void exitFoldervalue(EQLParser.FoldervalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#destinationvalue}.
	 * @param ctx the parse tree
	 */
	void enterDestinationvalue(EQLParser.DestinationvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#destinationvalue}.
	 * @param ctx the parse tree
	 */
	void exitDestinationvalue(EQLParser.DestinationvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#bodyvalue}.
	 * @param ctx the parse tree
	 */
	void enterBodyvalue(EQLParser.BodyvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#bodyvalue}.
	 * @param ctx the parse tree
	 */
	void exitBodyvalue(EQLParser.BodyvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#attachementsvalue}.
	 * @param ctx the parse tree
	 */
	void enterAttachementsvalue(EQLParser.AttachementsvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#attachementsvalue}.
	 * @param ctx the parse tree
	 */
	void exitAttachementsvalue(EQLParser.AttachementsvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#wordlist}.
	 * @param ctx the parse tree
	 */
	void enterWordlist(EQLParser.WordlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#wordlist}.
	 * @param ctx the parse tree
	 */
	void exitWordlist(EQLParser.WordlistContext ctx);
}