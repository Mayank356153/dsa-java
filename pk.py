import matplotlib.pyplot as plt
from matplotlib.patches import Rectangle, Circle, FancyArrowPatch, Polygon

def draw_activity_diagram():
    fig, ax = plt.subplots(figsize=(8, 12))
    
    ax.set_xlim(0, 10)
    ax.set_ylim(0, 20)
    ax.axis('off')

    def draw_box(x, y, text):
        rect = Rectangle((x, y), 4, 1.2, fill=False)
        ax.add_patch(rect)
        ax.text(x + 2, y + 0.6, text, ha='center', va='center')

    def draw_diamond(x, y, text):
        diamond = Polygon([[x+2, y+1.2], [x+4, y+0.6], 
                           [x+2, y], [x, y+0.6]], fill=False)
        ax.add_patch(diamond)
        ax.text(x+2, y+0.6, text, ha='center', va='center')

    def draw_arrow(x1, y1, x2, y2):
        arrow = FancyArrowPatch((x1, y1), (x2, y2),
                                arrowstyle='->')
        ax.add_patch(arrow)

    # Start
    start = Circle((5, 18.5), 0.3, fill=False)
    ax.add_patch(start)
    ax.text(5, 18.5, "Start", ha='center', va='center')

    # Activities
    draw_box(3, 16.5, "Enter Login Credentials")
    draw_diamond(3, 14.5, "Validate User?")
    draw_box(3, 12.5, "Display Main Menu")
    draw_box(3, 10.5, "Search Book")
    draw_box(3, 8.5, "Issue Book")
    draw_box(3, 6.5, "Return Book")
    draw_box(3, 4.5, "Logout")

    # End
    end = Circle((5, 3), 0.4, fill=False)
    ax.add_patch(end)
    ax.text(5, 3, "End", ha='center', va='center')

    # Arrows
    draw_arrow(5, 18.2, 5, 17.7)
    draw_arrow(5, 16.5, 5, 15.7)
    draw_arrow(5, 14.5, 5, 13.7)
    draw_arrow(5, 12.5, 5, 11.7)
    draw_arrow(5, 10.5, 5, 9.7)
    draw_arrow(5, 8.5, 5, 7.7)
    draw_arrow(5, 6.5, 5, 5.7)
    draw_arrow(5, 4.5, 5, 3.4)

    plt.title("UML Activity Diagram - Library Management System")
    plt.show()

if __name__ == "__main__":
    draw_activity_diagram()