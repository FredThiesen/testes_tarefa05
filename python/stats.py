def moving_average(seq, window=3):
    if window <= 0:
        raise ValueError("window must be positive")
    if not seq:
        return []
    out = []
    for i in range(len(seq)):
        start = max(0, i - window + 1)
        chunk = seq[start:i+1]
        out.append(sum(chunk) / len(chunk))
    return out

def normalize(seq):
    if not seq:
        return []
    total = sum(seq)
    if total == 0:
        return [0 for _ in seq]
    return [x/total for x in seq]
