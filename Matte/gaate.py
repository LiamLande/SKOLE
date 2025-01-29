


def gaate(b):
    st = str(b)
    arr = []
    for x in [st[i:i+2] for i in range(0, len(st), 2)]:
        arr.append(chr(int(x)+96))
    print("".join(arr))


a = 199 * 35081 * 1740581452903053379
gaate(a)
