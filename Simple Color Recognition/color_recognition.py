import cv2

cap = cv2.VideoCapture(2)
cap.set(cv2.CAP_PROP_FRAME_WIDTH, 1280)
cap.set(cv2.CAP_PROP_FRAME_HEIGHT, 720)

while True:
    _, frame = cap.read()
    hsv_frame = cv2.cvtColor(frame, cv2.COLOR_BGR2HSV)
    height, width, _ = frame.shape

    cx = int(width / 2)
    cy = int(height / 2)

    # Pick pixel value
    pixel_center = hsv_frame[cy, cx]
    hue_value = pixel_center[0]

    color = "Undefined"
    if hue_value < 3:
        color = "RED"
    elif hue_value < 7:
        color = "VERMILION"
    elif hue_value < 11:
        color = "ORANGE RED"
    elif hue_value < 15:
        color = "ORANGE"
    elif hue_value < 19:
        color = "GOLD"
    elif hue_value < 23:
        color = "YELLOW ORANGE"
    elif hue_value < 27:
        color = "AMBER"
    elif hue_value < 31:
        color = "YELLOW"
    elif hue_value < 35:
        color = "LEMON"
    elif hue_value < 39:
        color = "CHARTREUSE"
    elif hue_value < 43:
        color = "LIME GREEN"
    elif hue_value < 47:
        color = "LIME"
    elif hue_value < 51:
        color = "SPRING GREEN"
    elif hue_value < 55:
        color = "MINT"
    elif hue_value < 59:
        color = "AQUAMARINE"
    elif hue_value < 63:
        color = "CYAN"
    elif hue_value < 67:
        color = "SKY BLUE"
    elif hue_value < 71:
        color = "LIGHT BLUE"
    elif hue_value < 75:
        color = "POWDER BLUE"
    elif hue_value < 79:
        color = "AZURE"
    elif hue_value < 83:
        color = "BABY BLUE"
    elif hue_value < 87:
        color = "PERIWINKLE"
    elif hue_value < 91:
        color = "LAVENDER"
    elif hue_value < 95:
        color = "VIOLET"
    elif hue_value < 99:
        color = "LILAC"
    elif hue_value < 103:
        color = "MAUVE"
    elif hue_value < 107:
        color = "PLUM"
    elif hue_value < 111:
        color = "GRAPE"
    elif hue_value < 115:
        color = "INDIGO"
    elif hue_value < 119:
        color = "COBALT BLUE"
    elif hue_value < 123:
        color = "ROYAL BLUE"
    elif hue_value < 127:
        color = "NAVY BLUE"
    elif hue_value < 131:
        color = "BLUE"
    elif hue_value < 135:
        color = "CERULEAN"
    elif hue_value < 139:
        color = "TURQUOISE"
    elif hue_value < 143:
        color = "AQUA"
    elif hue_value < 147:
        color = "TURQUOISE BLUE"
    elif hue_value < 151:
        color = "TEAL"
    elif hue_value < 155:
        color = "JADE"
    elif hue_value < 159:
        color = "EMERALD"
    elif hue_value < 163:
        color = "PARAKEET GREEN"
    elif hue_value < 167:
        color = "FERN GREEN"
    elif hue_value < 171:
        color = "FOREST GREEN"
    elif hue_value < 175:
        color = "OLIVE GREEN"
    elif hue_value < 179:
        color = "SAGE GREEN"
    elif hue_value < 183:
        color = "MINT GREEN"
    elif hue_value < 187:
        color = "PINE GREEN"
    elif hue_value < 191:
        color = "MINT CREAM"
    elif hue_value < 195:
        color = "CHARTREUSE GREEN"
    elif hue_value < 199:
        color = "SEA GREEN"
    elif hue_value < 203:
        color = "HONEYDEW"
    elif hue_value < 207:
        color = "LIME GREEN"
    elif hue_value < 211:
        color = "IVY GREEN"
    elif hue_value < 215:
        color = "MINTY AQUA"
    elif hue_value < 219:
        color = "MINTY GREEN"
    elif hue_value < 223:
        color = "MINTY BLUE"
    elif hue_value < 227:
        color = "MINTY PURPLE"
    elif hue_value < 231:
        color = "MINTY PINK"
    elif hue_value < 235:
        color = "MINTY LAVENDER"
    elif hue_value < 239:
        color = "MINTY GRAY"
    elif hue_value < 243:
        color = "MINTY BROWN"
    elif hue_value < 247:
        color = "MINTY ORANGE"
    elif hue_value < 251:
        color = "MINTY YELLOW"
    elif hue_value < 255:
        color = "MINTY RED"
    elif hue_value < 259:
        color = "PEACH"
    elif hue_value < 263:
        color = "SALMON"
    elif hue_value < 267:
        color = "CORAL"
    elif hue_value < 271:
        color = "TOMATO"
    elif hue_value < 275:
        color = "ORANGE RED"
    elif hue_value < 279:
        color = "DARK ORANGE"
    elif hue_value < 283:
        color = "BRIGHT ORANGE"
    elif hue_value < 287:
        color = "PUMPKIN"
    elif hue_value < 291:
        color = "CARROT ORANGE"
    elif hue_value < 295:
        color = "GOLDENROD"
    elif hue_value < 299:
        color = "DANDELION"
    elif hue_value < 303:
        color = "SUNFLOWER"
    elif hue_value < 307:
        color = "MELLOW YELLOW"
    elif hue_value < 311:
        color = "GOLD"
    elif hue_value < 315:
        color = "MUSTARD YELLOW"
    elif hue_value < 319:
        color = "OLIVE"
    elif hue_value < 323:
        color = "OLIVE BROWN"
    elif hue_value < 327:
        color = "KHAKI"
    elif hue_value < 331:
        color = "BEIGE"
    elif hue_value < 335:
        color = "TAN"
    elif hue_value < 339:
        color = "SAND"
    elif hue_value < 343:
        color = "BROWN"
    elif hue_value < 347:
        color = "CHOCOLATE"
    elif hue_value < 351:
        color = "MAROON"
    elif hue_value < 355:
        color = "PLUM BROWN"
    elif hue_value < 359:
        color = "WINE"
    else:
        color = "RED"

    pixel_center_bgr = frame[cy, cx]
    b, g, r = int(pixel_center_bgr[0]), int(pixel_center_bgr[1]), int(pixel_center_bgr[2])

    cv2.rectangle(frame, (cx - 220, 10), (cx + 200, 120), (255, 255, 255), -1)
    cv2.putText(frame, color, (cx - 200, 100), 0, 3, (b, g, r), 5)
    cv2.circle(frame, (cx, cy), 5, (25, 25, 25), 3)

    cv2.imshow("Color - Tracker", frame)
    key = cv2.waitKey(1)
    if key == 27:
        break

cap.release()
cv2.destroyAllWindows()