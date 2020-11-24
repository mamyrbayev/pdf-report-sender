package kz.team.pdfreportsender.service;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.styledxmlparser.jsoup.Jsoup;
import com.itextpdf.styledxmlparser.jsoup.nodes.Document;
import org.springframework.stereotype.Service;
import org.xhtmlrenderer.pdf.ITextRenderer;

@Service
public class HtmlToPdfService {
//
//    public String generatePDFFromHTML() throws IOException, DocumentException {
//        Document document = new Document();
//        PdfWriter writer = PdfWriter.getInstance(document,
//                new FileOutputStream("/Users/user/Desktop/html.pdf"));
//        document.open();
//        XMLWorkerHelper.getInstance().parseXHtml(writer, document,
//                new FileInputStream("/Users/user/IdeaProjects/pdf-report-sender/src/main/resources/static/storymart/index.html"));
//
//        document.close();
//        return "ok";
//    }
//
//
//    public String generatePDFFromHTML2() throws IOException, DocumentException, com.lowagie.text.DocumentException {
//        String inputFile = "/Users/user/IdeaProjects/pdf-report-sender/src/main/resources/static/storymart/index.html";
//        String url = new File(inputFile).toURI().toURL().toString();
//        String outputFile = "/Users/user/Desktop/firstdoc.pdf";
//        OutputStream os = new FileOutputStream(outputFile);
//
//        ITextRenderer renderer = new ITextRenderer();
//        renderer.setDocument(url);
//        renderer.layout();
//        renderer.createPDF(os);
//
//        os.close();
//        return "ok";
//    }
//
//
    public String generatePDFFromHTML3() throws Exception {
//        String html = "/Users/user/IdeaProjects/pdf-report-sender/src/main/resources/static/storymart/index.html";
        String pdfFilePath = "/Users/user/Desktop/html.pdf";

        String html = new String(Files.readAllBytes(Paths.get("/Users/user/IdeaProjects/pdf-report-sender/src/main/resources/static/storymart/index.html")));
        System.out.println("HTML " + html);
        final Document document = Jsoup.parse(html);
        document.outputSettings().syntax(Document.OutputSettings.Syntax.xml);

        ITextRenderer renderer = new ITextRenderer();
        renderer.setDocumentFromString(document.html());
        renderer.layout();

        try (OutputStream os = Files.newOutputStream(Paths.get(pdfFilePath))) {
            renderer.createPDF(os);
        }
        return "ok";
    }
//
//
//    public String generatePDFFromHTML4() throws Exception {
//        String html = "/Users/user/IdeaProjects/pdf-report-sender/src/main/resources/static/storymart/index.html";
//        String pdfFilePath = "/Users/user/Desktop/html.pdf";
//        PdfWriter pdfWriter = null;
//
//        // create a new document
//        Document document = new Document();
//        try {
//
//            document = new Document();
//            // document header attributes
//            document.addAuthor("Kinns");
//            document.addAuthor("Kinns123");
//            document.addCreationDate();
//            document.addProducer();
//            document.addCreator("kinns123.github.io");
//            document.addTitle("HTML to PDF using itext");
//            document.setPageSize(PageSize.LETTER);
//
//            ByteArrayOutputStream baos = new ByteArrayOutputStream();
//            PdfWriter.getInstance(document, baos);
//
//            // open document
//            document.open();
//
//            XMLWorkerHelper xmlWorkerHelper = XMLWorkerHelper.getInstance();
//            xmlWorkerHelper.getDefaultCssResolver(true);
//            xmlWorkerHelper.parseXHtml(pdfWriter, document, new StringReader(
//                    html));
//            // close the document
//            document.close();
//            System.out.println("PDF generated successfully");
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//        return "ok";
//    }


//    public String generatePDFFromHTML5() throws Exception {
//
//        String html = "<html xmlns:th=\"http://www.thymeleaf.org\">\n" +
//                "<body>\n" +
//                "<h3 style=\"text-align: center; color: green\">\n" +
//                "    <span th:text=\"'Welcome to ' + ${to} + '!'\"></span>\n" +
//                "</h3>\n" +
//                "</body>\n" +
//                "</html>";
//        String pdfFilePath = "/Users/user/Desktop/html.pdf";
//
//        OutputStream outputStream = new FileOutputStream(pdfFilePath);
//
//        ITextRenderer renderer = new ITextRenderer();
//        renderer.setDocumentFromString(html);
//        renderer.layout();
//        renderer.createPDF(outputStream);
//
//        outputStream.close();
//        return "Aydoon";
//    }

//    public void export(HttpServletResponse response) throws DocumentException, IOException, DocumentException {
//        Document document = new Document(PageSize.A4);
//        PdfWriter.getInstance(document, response.getOutputStream());
//
//        document.open();
//        Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
//        font.setSize(18);
////        font.setColor(Color.BLUE);
//
//        Paragraph p = new Paragraph("List of Users", font);
//        p.setAlignment(Paragraph.ALIGN_CENTER);
//
//        document.add(p);
//
//        PdfPTable table = new PdfPTable(5);
//        table.setWidthPercentage(100f);
//        table.setWidths(new float[] {1.5f, 3.5f, 3.0f, 3.0f, 1.5f});
//        table.setSpacingBefore(10);
//
//        writeTableHeader(table);
//        writeTableData(table);
//
//        document.add(table);
//
//        document.close();

//    }
//}

}
