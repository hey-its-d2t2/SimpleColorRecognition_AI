import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.CvType;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.CvException;
import org.opencv.videoio.VideoCapture;
import org.opencv.imgproc.Imgproc;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.core.Core.MinMaxLocResult;
import org.opencv.core.MatOfPoint;
import org.opencv.core.MatOfPoint2f;
import org.opencv.core.MatOfPoint3f;
import org.opencv.core.MatOfFloat;
import org.opencv.core.CvType;
import org.opencv.videoio.Videoio;
import org.opencv.core.CvType;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ColorTracker {

    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public static void main(String[] args) {
        VideoCapture cap = new VideoCapture(2);
        cap.set(Videoio.CAP_PROP_FRAME_WIDTH, 1280);
        cap.set(Videoio.CAP_PROP_FRAME_HEIGHT, 720);

        JFrame frame = new JFrame("Color - Tracker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 720);
        frame.setVisible(true);

        JLabel label = new JLabel();
        frame.add(label);

        Mat frameMat = new Mat();
        Mat hsvFrame = new Mat();
        while (true) {
            cap.read(frameMat);
            Imgproc.cvtColor(frameMat, hsvFrame, Imgproc.COLOR_BGR2HSV);

            int height = frameMat.rows();
            int width = frameMat.cols();

            int cx = width / 2;
            int cy = height / 2;

            double[] pixelCenter = hsvFrame.get(cy, cx);
            double hueValue = pixelCenter[0];

            String color = "Undefined";
            if (hueValue < 3) {
                color = "RED";
            } else if (hueValue < 7) {
                color = "VERMILION";
            } else if (hueValue < 11) {
                color = "ORANGE RED";
            } else if (hueValue < 15) {
                color = "ORANGE";
            } else if (hueValue < 19) {
                color = "GOLD";
            } else if (hueValue < 23) {
                color = "YELLOW ORANGE";
            } else if (hueValue < 27) {
                color = "AMBER";
            } else if (hueValue < 31) {
                color = "YELLOW";
            } else if (hueValue < 35) {
                color = "LEMON";
            } else if (hueValue < 39) {
                color = "CHARTREUSE";
            } else if (hueValue < 43) {
                color = "LIME GREEN";
            } else if (hueValue < 47) {
                color = "LIME";
            } else if (hueValue < 51) {
                color = "SPRING GREEN";
            } else if (hueValue < 55) {
                color = "MINT";
            } else if (hueValue < 59) {
                color = "AQUAMARINE";
            } else if (hueValue < 63) {
                color = "CYAN";
            } else if (hueValue < 67) {
                color = "SKY BLUE";
            } else if (hueValue < 71) {
                color = "LIGHT BLUE";
            } else if (hueValue < 75) {
                color = "POWDER BLUE";
            } else if (hueValue < 79) {
                color = "AZURE";
            } else if (hueValue < 83) {
                color = "BABY BLUE";
            } else if (hueValue < 87) {
                color = "PERIWINKLE";
            } else if (hueValue < 91) {
                color = "LAVENDER";
            } else if (hueValue < 95) {
                color = "VIOLET";
            } else if (hueValue < 99) {
                color = "LILAC";
            } else if (hueValue < 103) {
                color = "MAUVE";
            } else if (hueValue < 107) {
                color = "PLUM";
            } else if (hueValue < 111) {
                color = "GRAPE";
            } else if (hueValue < 115) {
                color = "INDIGO";
            } else if (hueValue < 119) {
                color = "COBALT BLUE";
            } else if (hueValue < 123) {
                color = "ROYAL BLUE";
            } else if (hueValue < 127) {
                color = "NAVY BLUE";
            } else if (hueValue < 131) {
                color = "BLUE";
            } else if (hueValue < 135) {
                color = "CERULEAN";
            } else if (hueValue < 139) {
                color = "TURQUOISE";
            } else if (hueValue < 143) {
                color = "AQUA";
            } else if (hueValue < 147) {
                color = "TURQUOISE BLUE";
            } else if (hueValue < 151) {
                color = "TEAL";
            } else if (hueValue < 155) {
                color = "JADE";
            } else if (hueValue < 159) {
                color = "EMERALD";
            } else if (hueValue < 163) {
                color = "PARAKEET GREEN";
            } else if (hueValue < 167) {
                color = "FERN GREEN";
            } else if (hueValue < 171) {
                color = "FOREST GREEN";
            } else if (hueValue < 175) {
                color = "OLIVE GREEN";
            } else if (hueValue < 179) {
                color = "SAGE GREEN";
            } else if (hueValue < 183) {
                color = "MINT GREEN";
            } else if (hueValue < 187) {
                color = "PINE GREEN";
            } else if (hueValue < 191) {
                color = "MINT CREAM";
            } else if (hueValue < 195) {
                color = "CHARTREUSE GREEN";
            } else if (hueValue < 199) {
                color = "SEA GREEN";
            } else if (hueValue < 203) {
                color = "HONEYDEW";
            } else if (hueValue < 207) {
                color = "LIME GREEN";
            } else if (hueValue < 211) {
                color = "IVY GREEN";
            } else if (hueValue < 215) {
                color = "MINTY AQUA";
            } else if (hueValue < 219) {
                color = "MINTY GREEN";
            } else if (hueValue < 223) {
                color = "MINTY BLUE";
            } else if (hueValue < 227) {
                color = "MINTY PURPLE";
            } else if (hueValue < 231) {
                color = "MINTY PINK";
            } else if (hueValue < 235) {
                color = "MINTY LAVENDER";
            } else if (hueValue < 239) {
                color = "MINTY GRAY";
            } else if (hueValue < 243) {
                color = "MINTY BROWN";
            } else if (hueValue < 247) {
                color = "MINTY ORANGE";
            } else if (hueValue < 251) {
                color = "MINTY YELLOW";
            } else if (hueValue < 255) {
                color = "MINTY RED";
            } else if (hueValue < 259) {
                color = "PEACH";
            } else if (hueValue < 263) {
                color = "SALMON";
            } else if (hueValue < 267) {
                color = "CORAL";
            } else if (hueValue < 271) {
                color = "TOMATO";
            } else if (hueValue < 275) {
                color = "ORANGE RED";
            } else if (hueValue < 279) {
                color = "DARK ORANGE";
            } else if (hueValue < 283) {
                color = "BRIGHT ORANGE";
            } else if (hueValue < 287) {
                color = "PUMPKIN";
            } else if (hueValue < 291) {
                color = "CARROT ORANGE";
            } else if (hueValue < 295) {
                color = "GOLDENROD";
            } else if (hueValue < 299) {
                color = "DANDELION";
            } else if (hueValue < 303) {
                color = "SUNFLOWER";
            } else if (hueValue < 307) {
                color = "MELLOW YELLOW";
            } else if (hueValue < 311) {
                color = "GOLD";
            } else if (hueValue < 315) {
                color = "MUSTARD YELLOW";
            } else if (hueValue < 319) {
                color = "OLIVE";
            } else if (hueValue < 323) {
                color = "OLIVE BROWN";
            } else if (hueValue < 327) {
                color = "KHAKI";
            } else if (hueValue < 331) {
                color = "BEIGE";
            } else if (hueValue < 335) {
                color = "TAN";
            } else if (hueValue < 339) {
                color = "SAND";
            } else if (hueValue < 343) {
                color = "BROWN";
            } else if (hueValue < 347) {
                color = "CHOCOLATE";
            } else if (hueValue < 351) {
                color = "MAROON";
            } else if (hueValue < 355) {
                color = "PLUM BROWN";
            } else if (hueValue < 359) {
                color = "WINE";
            } else {
                color = "RED";
            }

            int b = (int) pixelCenterBGR.get(0);
            int g = (int) pixelCenterBGR.get(1);
            int r = (int) pixelCenterBGR.get(2);

            Scalar colorScalar = new Scalar(b, g, r);
            Imgproc.circle(frameMat, new Point(cx, cy), 10, colorScalar, 2);
            Imgproc.putText(frameMat, color, new Point(20, 40), Core.FONT_HERSHEY_SIMPLEX, 1, colorScalar, 2);

            BufferedImage image = matToBufferedImage(frameMat);
            ImageIcon imageIcon = new ImageIcon(image);
            label.setIcon(imageIcon);
            label.repaint();
        }
    }

    private static BufferedImage matToBufferedImage(Mat mat) {
        int type = BufferedImage.TYPE_BYTE_GRAY;
        if (mat.channels() > 1) {
            type = BufferedImage.TYPE_3BYTE_BGR;
        }
        BufferedImage image = new BufferedImage(mat.cols(), mat.rows(), type);
        byte[] data = new byte[mat.cols() * mat.rows() * (int) mat.elemSize()];
        mat.get(0, 0, data);
        image.getRaster().setDataElements(0, 0, mat.cols(), mat.rows(), data);
        return image;
    }
}
